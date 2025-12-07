git checkout -b  feature/right-version
git switch feature/right-version 

git switch develop 
 git merge feature/right-version
ижил мөрөн дэх утгыг өөрчилснөөр conflict үүснэ


<<<<<<< HEAD
     * @return multiply
=======
     * @return number
>>>>>>> feature/right-version


accept current одоогийн хувилбар эсвэл incoming change гэсэн 2р төрлийн сонголт гарж ирэх ба хөгжүүлэгч харж байгаад өөрөө шийднэ

Эсвэл merge edithor ашиглан адил logicoor conflict ийг засаж болно