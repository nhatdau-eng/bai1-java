Báo cáo chỉ số Cyclomatic Complexity
Sau khi tiến hành tái cấu trúc đoạn mã nguồn của hàm calculatePrice, độ phức tạp thuật toán  đã giảm đáng kể:
Mã nguồn cũ : Giá trị CC = 12. Hàm chứa tới 5 cấp độ if-else lồng ghép sâu tạo thành mô hình mũi tên, kết hợp nhiều điều kiện logic phức tạp lặp đi lặp lại cực kỳ khó bảo trì.
Mã nguồn mới: Giá trị CC = 9.
Kết quả tối ưu: Chỉ số Cyclomatic Complexity đã giảm được 3 đơn vị. Nhờ áp dụng kỹ thuật Mệnh đề bảo vệ  để thoát sớm khi có lỗi dữ liệu và tách riêng các điều kiện đặc biệt như ngày thứ Ba, luồng thực thi của hàm đã hoàn toàn được làm phẳng (không quá 2 cấp lồng nhau), giúp mã nguồn trở nên trực quan, tăng tốc độ xử lý và dễ dàng mở rộng các tính năng khuyến mãi về sau.