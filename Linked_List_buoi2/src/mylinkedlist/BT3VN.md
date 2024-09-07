 for (int i = 0; i <= index; i++) { temp = temp.next; }
 temp sẽ chạy từ đầu cho tới vị trí của index mới dừng, nên khi kết thúc temp nó sẽ dừng lại ở đúng vị trí index

for (int i = 0; i < index; i++) { temp = temp.next; }
temp sẽ chạy từ đầu cho vị trí n-1. Nếu i tăng thêm 1 sẽ dừng đúng vị trí của index. Không đúng với điều kiênj i < index .