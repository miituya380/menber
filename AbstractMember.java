import java.util.*;

abstract class AbstractMember {
    int _price;
    int _point;
    String _message;

    AbstractMember(int price) {
        _price = price;
        _point = 0;
        _message = "";
    }

    abstract public int getPoint();
    
    abstract protected void setMessage();

    abstract public String getMessage();

    protected int pointFive(int point) {
        Calendar calendar = Calendar.getInstance();
        int date = calendar.get(Calendar.DATE);
        if (date == EnumSpecialDay.POINTFIVE.getspecialDay()) {
            _point *= 5;
        }
        return _point;
    }

    public int getPrice() {
        return _price;
    }
}