| STT | Vấn đề | Mô tả | Nguyên nhân | Hậu quả | Cách khắc phục |
| --- | --- | --- | --- | --- | --- |
| 1 | Biến toàn cục requestCounter | Dùng `<%! %>` để khai báo biến dùng chung cho mọi request | JSP được chuyển thành Servlet → biến là instance variable | Không thread-safe, sai lệch dữ liệu khi nhiều người truy cập | Không dùng biến global trong JSP, chuyển sang Servlet hoặc scope phù hợp |
| 2 | Logic xử lý trong JSP | Tăng biến requestCounter++ và xử lý dữ liệu ngay trong View | Vi phạm mô hình MVC | Code khó bảo trì, khó mở rộng | Đưa logic sang Servlet/Controller |
| 3 | Không kiểm tra null | Gọi list.size() trực tiếp | Không kiểm tra dữ liệu từ request | Có thể gây NullPointerException | Kiểm tra list != null trước khi dùng |
| 4 | Lỗi bảo mật XSS | In trực tiếp `<%= sv.getFullName() %>` | Không escape dữ liệu đầu ra | Có thể bị chèn mã độc | Dùng `<c:out>` hoặc escape HTML |
| 5 | Lỗi cú pháp hiển thị | `<%= sv.getScore()%>`; dấu ; | Viết sai khi render dữ liệu | Hiển thị sai kết quả | Xóa dấu ; |