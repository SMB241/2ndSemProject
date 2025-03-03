package PT;

import java.util.ArrayList;
import java.util.List;

public class SecurityAgency {
        private List<SecurityPersonnel> personnelList;
        
        public SecurityAgency(){
            personnelList = new ArrayList<>();
        }
    
        public void addPersonel(int ID, String name, String area){
            SecurityPersonnel newPersonnel = new SecurityPersonnel(ID, name, area);
            personnelList.add(newPersonnel);
        }
    
        public String listPersonel(){
            if (personnelList.isEmpty()){
                return "No Personnel available";
            }
            StringBuilder result = new StringBuilder("List of Security Personnel:\n");
            for (SecurityPersonnel personnel : personnelList){
                result.append("ID #: ").append(personnel.getID()).append("    Name: ").append(personnel.getName()).append("    Area: ").append(personnel.getArea()).append("\n");
                result.append("-------------------------------\n");
            }
            return result.toString();
        }
    
        public String checkPersonnelByArea(String area){
            StringBuilder result = new StringBuilder();
            boolean found = false;
            for (SecurityPersonnel personnel : personnelList){
                if (personnel.getArea().equalsIgnoreCase(area)){
                    result.append("ID #: ").append(personnel.getID()).append("    Name: ").append(personnel.getName()).append("    Area: ").append(personnel.getArea()).append("\n");
                    result.append("-------------------------------\n");
                    found = true;
                }
            }
            if (!found){
                return "Personnel in area '" + area + "' not found";
            }
            return result.toString();
        }
    
        public String removePersonnel(int ID) {
            SecurityPersonnel toRemove = null;
            for (SecurityPersonnel personnel : personnelList) {
                if (personnel.getID() == ID) {
                    toRemove = personnel;
                    break;
                }
            }
            if (toRemove != null) {
                personnelList.remove(toRemove);
                return "Personnel removed.";
            } else {
                return "Personnel not found.";
            }
        }

        public boolean isDuplicateID(int ID) {
            for (SecurityPersonnel personnel : personnelList){
                if (personnel.getID() == ID){
                    return true;
                }
            }
                    return false;
        }
}
