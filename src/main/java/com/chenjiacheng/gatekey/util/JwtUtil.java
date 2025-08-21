package com.chenjiacheng.gatekey.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class JwtUtil {
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private long expiration;

    public String generateToken(UserDetails user) {
        Map<String,Object> claims = new HashMap<>();
        claims.put("roles", user.getAuthorities().stream()
                     .map(GrantedAuthority::getAuthority).collect(Collectors.toList()));
        return Jwts.builder()
                   .setClaims(claims)
                   .setSubject(user.getUsername())
                   .setIssuedAt(new Date())
                   .setExpiration(new Date(System.currentTimeMillis() + expiration))
                   .signWith(SignatureAlgorithm.HS512, secret)
                   .compact();
    }

    public String getUsername(String token){
        return Jwts.parser().setSigningKey(secret)
                   .parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validate(String token) {

        return false;
    }
    // 省略校验、刷新等
}