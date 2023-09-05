package com.leekm.board.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.leekm.board.entity.pk.FavoritePk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="favorite")
@Table(name="favorite")
@IdClass(FavoritePk.class)
public class FavoriteEntity {
  @Id
  private int boardNumber;
  @Id
  private String userEmail;
}
