วันอาทิตย์ที่ 15 กันยายน พ.ศ. 2567 เวลาสอบ 9.30 – 12.30 น 
เลือกทำข้อที่ 1 จะมีโฟลเดอร์หลักคือ APP , Controllers , Models , Views 
App : App.java รันโปรแกรมหลัก ทำงานต่อโดยการเแสดง GUI ใน Views 
Views : ViewsMain , ViewsCow , ViewsGoat 
ViewsMain ->  CheckCoworGoat เช็ครหัสว่าคือวัวหรือแพะหลังจากนั้นจะนำเข้า View ของแต่ละ Cow กับ Goat 
ViewsCow -> ตรวจสอบว่าเป็นวัวเสร็จแล้วจะทำการเช็ค เต้านมวัวที่ CowUdderChecker เมื่อตรวจสอบว่าเต้ามนมวัวมีทั้งหมด 4 เต้า จะทำการคำนวณ น้ำนมที่ได้โดยการดึง ข้อมูลอายุของวัวจาก Cow Models -> calculateMilkProduction หลังจากนั้น จะทำการคิด % ใหม่ โดย checkForUdderRecover เมื่อเริ่มต้นมี 3 เต้า มีโอกาส 20% ที่จะฟื้นตัวกลับมาเป็นวัว 4 เต้า และ , checkForUdderLoss เมื่อเริ่มต้นมี 4 เต้า มีโอกาส 5% ที่จะสูญเสีย 1 เต้า 
Controllers : CheckCoworGoat , CowUdderChecker ,CheckId 
Models : Cow , Cowdata 

 
 
