package com.javaspringversioning.javaspringversioning.api;

import com.javaspringversioning.javaspringversioning.dto.ProductV1Dto;
import com.javaspringversioning.javaspringversioning.dto.ProductV2Dto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    //URI VERSIONING

    //http://localhost:8080/api/v1/product

    @GetMapping(value = "/v1/product")
    private ResponseEntity<ProductV1Dto> pathgetProductV1(){
        return ResponseEntity.ok(new ProductV1Dto("Laptop from versiyon pathing v1"));
    }
    //http://localhost:8080/api/v2/product

    @GetMapping(value = "/v2/product")
    private ResponseEntity<ProductV2Dto> pathgetProductV2(){
        return ResponseEntity.ok(new ProductV2Dto("Laptop from versiyon pathing v2",10));
    }


    //PARAM VERSIONING

    //http://localhost:8080/api/param/product?apiVersion=1

    @GetMapping(value = "/param/product",params = "apiVersion=1")
    private ResponseEntity<ProductV1Dto> paramgetProductV1(){
        return ResponseEntity.ok(new ProductV1Dto("Laptop from versiyon pathing v1"));
    }
    //http://localhost:8080/api/param/product?apiVersion=2

    @GetMapping(value = "/param/product",params = "apiVersion=2")
    private ResponseEntity<ProductV2Dto> paramgetProductV2(){
        return ResponseEntity.ok(new ProductV2Dto("Laptop from versiyon pathing v2",10));
    }

    //PARAM VERSIONING

    //http://localhost:8080/header/product

    @GetMapping(value = "/header/product",headers = "X-API-VERSION=1")
    private ResponseEntity<ProductV1Dto> headergetProductV1(){
        return ResponseEntity.ok(new ProductV1Dto("Laptop from versiyon pathing v1"));
    }
    //http://localhost:8080/header/product

    @GetMapping(value = "/header/product",headers = "X-API-VERSION=2")
    private ResponseEntity<ProductV2Dto> headergetProductV2(){
        return ResponseEntity.ok(new ProductV2Dto("Laptop from versiyon pathing v2",10));
    }


}
