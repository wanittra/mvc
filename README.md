วันอาทิตย์ที่ 15 กันยายน พ.ศ. 2567 เวลาสอบ 9.30 – 12.30 น 
เลือกทำข้อที่ 1 อ้างอิงตาม Requirements
RQ (1) แบ่งโฟลเดอร์ออกเป็น APP , Controllers , Models , Views
RQ (2) Models : Cow , Cowdata เก็บฐานข้อมูลวัวในระบบ + มีแพะแฝงอยู่ในฐานข้อมูล 2 ตัว นอกจาก id ข้อมูลส่วนอื่นๆของแพะเป็น null ทั้งหมด
RQ (3) ViewsMain เป็นหน้างต่างส่วนหลักที่ตรวจสอบ input เข้ามาเป็นเลขไหม , เป็นรหัส 8 ตัวไหม และก็รหัสไม่นำหน้าด้วยเลข 0 ใช่ไหม ถ้ามีข้อผิดพลาด "Invalid ID Format!" ถ้าไม่มีข้อผิดพลาดและ id ตรงกับ id ในฐานข้อมูลจะถูกตรวจสอบต่อ CheckCoworGoat ถ้าเป็นวัว -> ViewsCow : จะถูกตรวจสอบเต้านม getCowudder ถ้าเต้านมมี 4 แสดง "Milk produced: " + milkProduced + " liters."  milkProduced จะถูกอธิบายต่อใน RQ (4) ถ้ามีเต้านม 3 แสดง "Cannot milk cow with 3 udders."
ถ้าเป็นแพะ -> ViewsGoat : "Send Goat to the Mountain"
RQ (4) CowUdderChecker แบ่งเป็น 3 method , 1) checkForUdderLoss : มี 4 เต้า มีโอกาส 5% ที่จะสูญเสีย 1 เต้า
, 2) checkForUdderRecovery : มี 3 เต้า มีโอกาส 20% ที่จะฟื้นตัวกลับมาเป็นวัว 4 เต้า , 3) CalculateMilkProduction : สำหรับวัวที่มีเต้า 4 เต้าจะถูกคำนวณน้ำนมใน Medthod นี้ (สำหรับ RQ (5)) 
หลักจากนั้น ViewsCow , ViewsGoat จะวนกลับไปที่ ViewsMain 
 

 
 
