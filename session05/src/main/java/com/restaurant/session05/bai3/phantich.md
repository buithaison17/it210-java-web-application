## 1. Luồng dữ liệu (Data Flow)

**Bước 1: View A (danh sách)**

* Người dùng nhấn nút "Chỉnh sửa"
* Link: `/bai3/edit/{id}`

**Bước 2: Controller**

* Nhận `id` từ URL
* Gọi Service tìm món ăn

**Bước 3: Service**

* Tìm `Dish` theo id
* Trả về đối tượng hoặc null

**Bước 4: Xử lý**

* Nếu tồn tại:

    * Đưa `dish` vào Model
    * Trả về `edit-dish.html`
* Nếu không tồn tại:

    * Redirect `/bai2/dishes`
    * Thêm message: "Không tìm thấy món ăn yêu cầu!"

**Bước 5: View B (form)**

* Dùng `th:object="${dish}"`
* Dùng `th:field` để bind dữ liệu vào input

---

## 2. Luồng tổng quát

```
List View
 → Click Edit
 → /bai3/edit/{id}
 → Controller
 → Service
 → Model (dish)
 → Edit View
```

---

## 3. Thymeleaf sử dụng

* `th:object` → bind object
* `th:field` → bind input
* `@{...}` → tạo URL động

