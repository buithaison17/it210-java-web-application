Tiêu chí | Contructor Injection | Field Injection
--------|---------------------|---------------
Độ an toàn | Đảm bảo tất cả dependency được inject, compile-time check | Có thể null nếu Spring không inject
Testability | Dễ mock/test vì có thể tạo instance bằng constructor | Khó test, cần reflection hoặc Spring context
Maintenance | Rõ ràng, ai phụ thuộc vào ai | Không thấy trực tiếp dependency