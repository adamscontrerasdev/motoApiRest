/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MotoApp.moto.repository;

import com.MotoApp.moto.modelo.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMotoRepository extends JpaRepository<Moto, Long> {
}
