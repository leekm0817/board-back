package com.leekm.board.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import com.leekm.board.entity.resultSet.CommentListResultSet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CommentListResponseDto {
  private String ProfileImageUrl;
  private String Nickname;
  private String writeDatetime;
  private String contents;

  public CommentListResponseDto(CommentListResultSet resultSet) {
    this.ProfileImageUrl = resultSet.getProfileImageUrl();
    this.Nickname = resultSet.getNickname();
    this.writeDatetime = resultSet.getwriteDatetime();
    this.contents = resultSet.getContents();
  }

  public static List<CommentListResponseDto> copyList(List<CommentListResultSet> resultSets) {

    List<CommentListResponseDto> commentList = new ArrayList<>();

    for (CommentListResultSet resultSet: resultSets) {
      CommentListResponseDto commentItem = new CommentListResponseDto(resultSet);
      commentList.add(commentItem);
    }

    return commentList;

  }
}
