Input:

•	UserId: mã khách hàng

•	foodId: mã món ăn

•	quantity: số lượng

Output:

•	success: true/ false

•	message: thông báo kết quả

•	remainingBalance: số dư sau khi đặt đồ ăn

Luồng xử lý
1.	Kiểm tra tồn kho
a.	Nếu stock < số lượng gọi → Lỗi
2.	Kiểm tra số dư tài khoản
a.	Nếu balance < Tổng tiền đơn hàng → Lỗi
3.	Nếu đủ số lượng và đủ tiền:
a.	Trừ tiền người dùng
b.	Giảm số lượng đồ ăn trong kho
4.	Trả kết quả về cho người dùng