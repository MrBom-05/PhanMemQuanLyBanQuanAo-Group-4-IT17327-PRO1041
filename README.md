# Phần Mềm Quản Lý Bán Quần Áo -Group-4-IT17327-PRO1041
Dự án 1 của nhóm 4, Good good 🧠
### 2. Format và import 
- Code bắt buộc phải format. Phải dùng format chung cùng với format chuẩn của dự án và code phần nào bôi đen phần đấy và format. Không được phép format cả trang.
- Phải xoá những biến hoặc thư viên import thừa đi. Dùng biến nào thư viên nào thì khai báo và import thư viện đấy
- Không được import wildcard. Tức là import *.
 
 ### III. FE
 
 ### IV. Git
#### Các bước làm việc vs git:
    B1: Tạp Branch From Nhanh Develop
    B2: Git fetch + Git pull từ nhánh develop
    B3: Code
    B4: Chọn file code thay đổi và commit 
    B5: Push lên
    B6: Tạo MR tới nhánh develop

#### Quy định:
 - Tất cả mọi nhánh đều phải tách từ nhánh develop
 - Quy tắc đặt tên nhánh: TaskID/Tên nhánh/ Tên người làm 
    - Ví dụ: SP1-BE/implement-company/HangNT
 - Sau khi code xong bắt buộc phải tạo PR(Pull Request) và add reviewer vào
 - Header của PR là nội dung chức năng làm, Content thì ghi ra cac chức năng nào vs 1 video quay output sản phẩm và đính kèm
 - Tuyệt đối không được ấn vào button merge khi làm 
 - Kéo task trên trello khi hoàn thành và ping người review 
 - Header của PR là nội dung chức năng làm, Content thì ghi ra cac chức năng nào vs 1 video quay output sản phẩm và đính kèmta
 - Sau 1 đợt sẽ relase vào nhánh master. Khi có bug gấp phát hiện ra sai từ master sẽ tạo nhánh hot fix và tạo trực tiếp từ master theo format: HOTFIX-BE(hoặc FE)/Tên việc/Tên người
    - Ví dụ: HOTFIX-BE/Fix-bug-UI/HangNT
 - Khi implement xong thì phải tạo MR và add 2 người còn lại vào review. Bug => Fix. 2 người còn lại approve => merge 
 - Rebase commit after push 
- Khi viết UT cover ít nhất 80%
    
