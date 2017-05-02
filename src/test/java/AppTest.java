import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Can on 2.5.2017.
 */
public class AppTest {

    @Test
    public void UserTest(){
        User user1 = new User();
        user1.User("Mustafa","1234567");
        assertTrue(true);
    }
    //ŞARKICILARI LİSTELİYOR

    @Test
    public void SingersAndSingersList(){
        ListSingerAndAlbums singer = new ListSingerAndAlbums();
        singer.SingersAndSingersList();
    }

    //ŞARKICI ADI VE PARÇALARI LİSTELİYOR. Şarkıcı ve parçaları for ile dönüldü yorum satırına alındı.
    @Test
    public void ShowSingerAlbums(){
        ListSingerAndAlbums singer = new ListSingerAndAlbums();
        singer.ListSingersAlbums();
    }

    //Sanatçı Arama

    @Test
    public void ContainsSingers(){
        System.out.println("Sanatçı  varmı : " + (new ListSingerAndAlbums().ContainsSinger("katyyperyy")));
    }

    //Albümde Arama

    @Test
    public void KattyPerryContainsAlbumsTest(){
        System.out.println("KattyPerry'nin Albümünde Bu Şarkı Varmı : "
                + (new ListSingerAndAlbums().KattyPerryContainsAlbums("Rise")));
    }

    //Albümde Arama

    @Test
    public void RihannaContainsAlbumsTest(){
        System.out.println("Rihanna'nin Albümünde Bu Şarkı Varmı : "
                + (new ListSingerAndAlbums().RihannaContainsAlbums("Umbrella")));
    }

    //Albümde Arama

    @Test
    public void JenniferLopezContainsAlbumsTest(){
        System.out.println("JenniferLopez'in Albümünde Bu Şarkı Varmı : "
                + (new ListSingerAndAlbums().JenniferLopezContainsAlbums("Papi")));
    }

    //Çalma Listesi Oluştur, ŞarkıcıAdı Albüm Adı Albümdeki Şarkılar Albüm özellikleri.

    @Test
    public void PlayListDetails(){
        CreatePlayList list = new CreatePlayList();
        list.PlayList("SingerName","AlbümsName",1000);
    }
    //Şarkı Listesi Oluştur, Detay..
    @Test
    public void SongListDetails(){
        CreatePlayList list = new CreatePlayList();
        list.SongList("Mustafa","DenemeAlbum","Mustafa",20000,"www.youtube.com");
    }

    //Çalma Listesini Göster

    @Test
    public void ListPlayList(){
        PlayListDetails();
    }

    //PlayListte Arama

    @Test
    public void ContainsPlayList(){
        System.out.println("PlayList'de Bu Şarkı varmı : "
                + (new CreatePlayList().ContainsPlayList("deneme")));
    }

}
