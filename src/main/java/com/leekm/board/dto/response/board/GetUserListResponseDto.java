package com.leekm.board.dto.response.board;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.leekm.board.common.response.ResponseCode;
import com.leekm.board.common.response.ResponseMessage;
import com.leekm.board.dto.response.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetUserListResponseDto extends ResponseDto {
  
  private List<BoardListResponseDto> boardList;

  private GetUserListResponseDto(String code, String message, List<BoardListResponseDto> boardList) {
    super(code, message);
    this.boardList = boardList;
  }

  public static ResponseEntity<GetUserListResponseDto> success(List<BoardListResponseDto> boardList) {
    GetUserListResponseDto result = new GetUserListResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS, boardList);
    return ResponseEntity.status(HttpStatus.OK).body(result);
  }

}