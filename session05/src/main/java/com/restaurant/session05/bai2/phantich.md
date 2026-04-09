## Luồng Input - Output

### Input

* Người dùng truy cập: `GET /bai2/dishes`

### Xử lý

* Controller nhận yêu cầu
* Gọi Service lấy `List<Dish>`
* Đưa dữ liệu vào Model: `dishes`

### Output

* Thymeleaf render HTML:
    * Hiển thị danh sách món
    * Hết hàng → chữ đỏ
    * Danh sách rỗng → thông báo