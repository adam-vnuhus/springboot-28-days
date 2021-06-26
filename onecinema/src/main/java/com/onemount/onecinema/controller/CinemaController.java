package com.onemount.onecinema.controller;

import java.util.List;

import com.onemount.onecinema.model.Cinema;
import com.onemount.onecinema.service.CinemaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(value = "/cinema")
public class CinemaController {
  @Autowired
  private CinemaService cinemaService;

  @Operation(summary = "Get all list cinemas")
  @GetMapping
  public ResponseEntity<List<Cinema>> findAll() {
    return ResponseEntity.ok().body(cinemaService.findAll());
  }
}