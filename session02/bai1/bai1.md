
Trong file `MyWebAppInitializer.java`, phương thức `getServletMappings` chỉ nhận chỉ nhận những request bắt đầu từ "/api", do đó, những request khác sẽ không được xử lý và phải để là "/".

Trong file `WebConfig.java`, `ComponentScan` đang chỉ quét những component có trong package service, do đó, không tìm thấy controller để xử lý request.

Nếu chỉ sửa lỗi 1 mà không sửa lỗi 2, chương trình vẫn sẽ không chạy.