public interface IEntityRepository<T extends IEntity> {
    void add(T entity);

    void delete(T entity);

    void update(T entity);

}
// Bu interface T tipinde çalışsın diyoruz. Entity dediğimiz bir değişkendir, veritabanı nesnesi
// anlamına gelir. Bizim tüm metodlarımız T tipinde çalışsın istedik.
//Generic kısıtlar extends olarak yazılır.