package eng;

import ukr.Авторизація;

public class Authorization extends Авторизація {
    public boolean authorize (DataBase db) {
        return авторизуватися(db);
    }
}
