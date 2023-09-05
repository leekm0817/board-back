package com.leekm.board.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import com.leekm.board.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FavoriteListResponseDto {
  private String Email;
  private String nickname;
  private String profileImageUrl;

  public FavoriteListResponseDto(UserEntity userEntity) {
    this.Email = userEntity.getEmail();
    this.nickname = userEntity.getNickname();
    this.profileImageUrl = userEntity.getProfileImageUrl();
  }

  public static List<FavoriteListResponseDto> copyEntityList(List<UserEntity> userEntities) {

    List<FavoriteListResponseDto> favoriteList = new ArrayList<>();

    for (UserEntity userEntity: userEntities) {
      FavoriteListResponseDto favoriteItem = new FavoriteListResponseDto(userEntity);
      favoriteList.add(favoriteItem);
    }

    return favoriteList;

  }
}
