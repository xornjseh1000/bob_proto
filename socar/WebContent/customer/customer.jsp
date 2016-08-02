<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<form name="BoardWriteForm" method="post"
		action="Board_Write_action.jsp" onsubmit="return boardWriteCheck();">

		<colgroup>
			<col width="20%">
			<col width="80%">
		</colgroup>
		<table summary="">
			<h1>1:1문의하기</h1>
			<br />
			<tr>
				<td>문의분류</td>
				<br />
			</tr>
			<select>
				<option value="">예약/결제문의</option>
				<option value="">가입문의</option>
				<option value="">차량이용/사고</option>
				<option value="">불편접수/건의</option>
				<option value="">프로모션/쿠폰</option>
				<option value="">법인/단체</option>
				<option value="">탈퇴</option>
				<option value="">쏘파라치</option>
				<option value="">기타</option>
			</select>

			<tr>
				<td>제목/내용</td>
				<td><input type=text name=email size=50></td>
			</tr>


			<tr>
				<td>내 용</td>
				<td><textarea name=content rows="10" cols="100"></textarea></td>
			</tr>
			<tr>
				<td>파일첨부</td>
				<td><input type=password name=password size=15 maxlength=15><input
					type="submit" value="등록"></td>
			</tr>
			<tr>
				<td colspan=2><hr size=1></td>
			</tr>
			<tr>
				<td colspan="2"><div align="center">
						<input type="submit" value="등록"> <input type="button"
							value="뒤로">
					</div></td>
			</tr>
		</table>
	</form>
	</table>

</body>
</html>