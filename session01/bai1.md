Đoạn code sai:
public RechargeService(){
	this.gateway = new InternalPaymentGateway();
}

Giải thích: 
Nếu sau này muốn đổi sang ExternalPaymentGateway hay gateway khác, bạn phải sửa code của RechargeService.

Không thể thay đổi implementation dễ dàng
