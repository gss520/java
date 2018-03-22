<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>perrier</title>
  <link rel="icon" href="favicons/1.png">
  <link rel="stylesheet" href="css/reset.css">
  <link rel="stylesheet" href="css/index.css">
</head>
<body>

  <header class="header">
    <div class="header-container">
      <div class="header-top">
        <a href="#" class="logo"></a>
        <nav class="header-nav">
          <ul>
            <li><a href="#" class="header-nav__cur">MAGAZINE</a></li>
            <li><a href="#">PERRIER ANYTIME</a></li>
            <li><a href="#">PRODUCTS</a></li>
            <li><a href="#">SINCE 1863</a></li>
          </ul>
        </nav>
        <div class="header-search">
          <input type="text" class="text" placeholder="here...">
          <div class="btn"><i class="icon-sprite"></i></div>
          <div class="result">
            <a href="#" class="result-item">
              <span class="rank">1</span>
              <span class="title">Perrier C Vitamine</span>
              <span class="num">4$</span>
            </a>
            <a href="#" class="result-item">
              <span class="rank">2</span>
              <span class="title">Perrier Green</span>
              <span class="num">4$</span>
            </a>
            <a href="#" class="result-item">
              <span class="rank">3</span>
              <span class="title">Bloody Perrier</span>
              <span class="num">3$</span>
            </a>
            <a href="#" class="result-item">
              <span class="rank">4</span>
              <span class="title">Perrier Basilic</span>
              <span class="num">4$</span>
            </a>
            <a href="#" class="result-item">
              <span class="rank">5</span>
              <span class="title">Perrier Red Rabbit</span>
              <span class="num">4$</span>
            </a>
            <div class="history">
              <span>search history</span>
              <i class="icon-sprite"></i>
            </div>
          </div>
        </div>
        <div class="header-login"><%if(session.getAttribute("userid")!=null){ %>
          <a href="land.jsp" class="login"><%=session.getAttribute("userid")%></a>
          <%}else{ %>
          <a href="land.jsp" class="login">Login</a><%} %>
          <a href="register.jsp" class="open-green">register</a>
          <a href="shopping_index.jsp" class="open-vip">Shopping</a>
        </div>
      </div>
      <ul class="header-subNav">
        <li><a href="#" class="subNav-cur">Home Page</a></li>
        <li><a href="#">Factory</a></li>
        <li><a href="#">Logistics</a></li>
        <li><a href="#">Sale</a></li>
        <li><a href="#">Feedback</a></li>
        <li><a href="#">Other</a></li>
      </ul>
    </div>
  </header>

  <!-- 新歌首发 -->
  <div class="main" id="newSong">
    <div class="main-inner">
      <div class="main-title">
        <h2 class="title"><i></i></h2>
        <span class="line line-left"></span>
        <span class="line line-right"></span>
      </div>
      <a href="#" class="readAll">MORE<i class="icon-sprite"></i></a>
      <div class="main-tab tab-title">
        <a href="javascript:;" class="item item-cur">more</a>
        <a href="javascript:;" class="item">DETOX</a>
        <a href="javascript:;" class="item">NATURAL</a>
        <a href="javascript:;" class="item">CHILL</a>
        <a href="javascript:;" class="item">PARTY</a>
      </div>
      <div class="main-slider tab-cont">
        <ul class="slider-wrapper">
          <li>
            <a href="#" class="img">
              <img src="images/cont/slider_img1.jpg" width="80%" height="80%" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">Perrier Green B<br/><br/>4$</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="#" class="author">Tom</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img2.jpg" width="80%" height="80%" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">Perrier P.K.G<br/><br/>4$</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">Cool</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img3.jpg" width="80%" height="80%" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">Perrier Spritz<br/><br/>4$</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">Tom</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img4.jpg" width="80%" height="80%" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">Perrier VIP<br/><br/>4$</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">Jack</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img1.jpg" width="80%" height="80%" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">Perrier Ginger T<br/><br/>4$</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">Rose</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img2.jpg" width="80%" height="80%" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">Bloody Perrier<br/><br/>3$</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">Tom</a>            
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img3.jpg" width="80%" height="80%" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">Perrier Red Rabbit<br/><br/>4$</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">Jack</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img4.jpg" width="80%" height="80%" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">Perrier Basilic<br/><br/>4$</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">Rose</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img1.jpg" width="80%" height="80%" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">Perrier C Vitamine<br/><br/>4$</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">Tom</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img2.jpg" width="80%" height="80%" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">Perrier Green<br/><br/>4$</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">Cool</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img3.jpg" width="80%" height="80%" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">Perrier St Tropez<br/><br/>4$</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">Dava</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img4.jpg" width="80%" height="80%" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">Perrier Beat Smash<br/><br/>4$</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">Mia</a>
            </div>
          </li>
        </ul>
        <div class="slider-btns">
          <span class="cur"><i></i></span>
          <span><i></i></span>
          <span><i></i></span>
        </div>
      </div>
    </div>
    <div class="main-operate">
      <a href="javascript:;" class="slider-prev"><i class="icon-sprite"></i></a>
      <a href="javascript:;" class="slider-next"><i class="icon-sprite"></i></a>
    </div>
  </div>

  <!-- 精彩推荐 -->
  <div class="main" id="recommend">
    <div class="main-inner">
      <div class="main-title">
        <h2 class="title"><i></i></h2>
        <span class="line line-left"></span>
        <span class="line line-right"></span>
      </div>
      <div class="carousel">
        <div class="carousel-slider">
          <a href="#" class="item item-pic1"><img src="images/cont/carousel_img1.jpg" alt="#"></a>
          <a href="#" class="item item-pic2"><img src="images/cont/carousel_img2.jpg" alt="#"></a>
          <a href="#" class="item item-pic3"><img src="images/cont/carouse_img3.jpg" alt="#"></a>
          <a href="#" class="item item-pic4"><img src="images/cont/carouse_img4.jpg" alt="#"></a>
          <a href="#" class="item item-pic5"><img src="images/cont/carouse_img5.jpg" alt="#"></a>
          <a href="#" class="item item-pic6"><img src="images/cont/carouse_img6.jpg" alt="#"></a>
        </div>
        <div class="slider-btns">
          <span class="cur"><i></i></span>
          <span><i></i></span>
          <span><i></i></span>
          <span><i></i></span>
          <span><i></i></span>
          <span><i></i></span>
        </div>
      </div>
    </div>
    <div class="main-operate">
      <a href="#" class="slider-prev"><i class="icon-sprite"></i></a>
      <a href="#" class="slider-next"><i class="icon-sprite"></i></a>
    </div>
  </div>

  <!-- 排行榜 -->
  <div class="main" id="rank">
    <div class="main-inner">
      <div class="main-title">
        <h2 class="title"><i></i></h2>
        <span class="line line-left"></span>
        <span class="line line-right"></span>
      </div>
      <a href="#" class="readAll">MORE<i class="icon-sprite"></i></a>
      <ul class="rank-list">
        <li class="rank-list__item rank-list__1">
          <span class="rank-bg"></span>
          <span class="mask"></span>
          <i class="icon-play"></i>
          <div class="title">
            <i></i>
            <h3>热销饮品</h3>
          </div>
          <i class="line"></i>
          <ul class="song-list">
            <li class="song-list__item">
              <a href="shopping_index.jsp"><span>1</span>丝袜奶茶</a>
              <span>Tom</span>
            </li>
            <li class="song-list__item">
              <a href="shopping_index.jsp"><span>2</span>奶沫鸳鸯奶茶</a>
              <span>Tom</span>
            </li>
            <li class="song-list__item">
              <a href="shopping_index.jsp"><span>3</span>伯爵奶茶</a>
              <span>Tom</span>
            </li>
            <li class="song-list__item">
              <a href="shopping_index.jsp"><span>4</span>布丁奶茶</a>
              <span>Tom</span>
            </li>
          </ul>
        </li>
        <li class="rank-list__item rank-list__2">
          <span class="rank-bg"></span>
          <span class="mask"></span>
          <i class="icon-play"></i>
          <div class="title">
            <i></i>
            <h3>热饮</h3>
          </div>
          <i class="line"></i>
          <ul class="song-list">
            <li class="song-list__item">
              <a href="shopping_index.jsp"><span>1</span>红豆奶茶</a>
              <span>Tom</span>
            </li>
            <li class="song-list__item">
              <a href="shopping_index.jsp"><span>2</span>玫瑰奶茶</a>
              <span>Tom</span>
            </li>
            <li class="song-list__item">
              <a href="shopping_index.jsp"><span>3</span>皇家奶茶</a>
              <span>Tom</span>
            </li>
            <li class="song-list__item">
              <a href="shopping_index.jsp"><span>4</span>丝滑奶茶 (Live)</a>
              <span>Tom</span>
            </li>
          </ul>
        </li>
        <li class="rank-list__item rank-list__3">
          <span class="rank-bg"></span>
          <span class="mask"></span>
          <i class="icon-play"></i>
          <div class="title">
            <i></i>
            <h3>新品</h3>
          </div>
          <i class="line"></i>
          <ul class="song-list">
            <li class="song-list__item">
              <a href="shopping_index.jsp"><span>1</span>港式奶茶</a>
              <span>Tom</span>
            </li>
            <li class="song-list__item">
              <a href="shopping_index.jsp"><span>2</span>玫瑰奶昔</a>
              <span>Tom</span>
            </li>
            <li class="song-list__item">
              <a href="shopping_index.jsp"><span>3</span>玫瑰香芋奶茶</a>
              <span>Tom</span>
            </li>
            <li class="song-list__item">
              <a href="shopping_index.jsp"><span>4</span>仙草奶茶</a>
              <span>Tom</span>
            </li>
          </ul>
        </li>
        <li class="rank-list__item rank-list__4">
          <span class="rank-bg"></span>
          <span class="mask"></span>
          <i class="icon-play"></i>
          <div class="title">
            <i></i>
            <h3>缺货</h3>
          </div>
          <i class="line"></i>
          <ul class="song-list">
            <li class="song-list__item">
              <a href="#"><span>1</span>热可可奶茶</a>
              <span>Tom</span>
            </li>
            <li class="song-list__item">
              <a href="#"><span>2</span>冰绿抹奶茶</a>
              <span>Tom</span>
            </li>
            <li class="song-list__item">
              <a href="#"><span>3</span>蜜爽绿豆奶茶</a>
              <span>Tom</span>
            </li>
            <li class="song-list__item">
              <a href="#"><span>4</span>夏日热恋</a>
              <span>Tom</span>
            </li>
          </ul>
        </li>
      </ul>
    </div>
  </div>

  <!-- 热门歌单 -->
  <div class="main" id="hotSong">
    <div class="main-inner">
      <div class="main-title">
        <h2 class="title"><i></i></h2>
        <span class="line line-left"></span>
        <span class="line line-right"></span>
      </div>
      <div class="main-slider">
        <ul class="slider-wrapper">
          <li>
            <a href="#" class="img">
              <img src="images/cont/slider_img1.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <!-- <a href="#">那个静默的阳光午后</a> -->
                <a href="shopping_index.jsp">冰爽夏日</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">订购量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img2.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">桃芒恋</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">订购量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img3.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">爽口汁</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">订购量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img4.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">繁华夏日</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">订购量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img5.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">雪碧</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">订购量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img6.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">可乐</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">订购量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img7.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">水蜜桃</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">订购量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img8.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="#">桃芒恋</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">订购量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img9.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">桃芒恋</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">订购量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img10.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">桃芒恋</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">订购量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img11.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">桃芒恋</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">订购量：179.7万</a>
            </div>
          </li>
          <li>
            <a href="shopping_index.jsp" class="img">
              <img src="images/cont/slider_img12.jpg" alt="#">
              <span class="mask"></span>
              <i class="icon-play"></i>
            </a>
            <div class="info">
              <div class="title">
                <a href="shopping_index.jsp">桃芒恋</a>
                <i class="icon-sprite"></i>
              </div>
              <a href="shopping_index.jsp" class="author">订购量：179.7万</a>
            </div>
          </li>
        </ul>
        <div class="slider-btns">
          <span class="cur"><i></i></span>
          <span><i></i></span>
          <span><i></i></span>
        </div>
      </div>
    </div>
    <div class="main-operate">
      <a href="javascript:;" class="slider-prev"><i class="icon-sprite"></i></a>
      <a href="javascript:;" class="slider-next"><i class="icon-sprite"></i></a>
    </div>
  </div>


  <!-- MV -->
  <div class="main" id="mv">
    <div class="main-inner">
      <div class="main-title">
        <h2 class="title"><i></i></h2>
        <span class="line line-left"></span>
        <span class="line line-right"></span>
      </div>
      <a href="#" class="readAll">MORE<i class="icon-sprite"></i></a>
      <div class="main-tab tab-title">
        <a href="javascript:;" class="item item-cur">more</a>
        <a href="javascript:;" class="item">PARIS</a>
        <a href="javascript:;" class="item">Dunkerque</a>
        <a href="javascript:;" class="item">lille</a>
        <a href="javascript:;" class="item">Lyon</a>
        <a href="javascript:;" class="item">Nancy</a>
      </div>
      <ul class="mv-list tab-cont">
        <li class="item">
          <a href="#" class="img"><img src="images/cont/mv_img1.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="#" class="title">Let Me Love You</a>
            <a href="#" class="author">PARIS</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="#" class="img"><img src="images/cont/mv_img2.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="#" class="title">Let Me Love You</a>
            <a href="#" class="author">Dunkerque</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="#" class="img"><img src="images/cont/mv_img3.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="#" class="title">Let Me Love You</a>
            <a href="#" class="author">lille</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="#" class="img"><img src="images/cont/mv_img4.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="#" class="title">Let Me Love You</a>
            <a href="#" class="author">Nancy</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="#" class="img"><img src="images/cont/mv_img5.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="#" class="title">Let Me Love You</a>
            <a href="#" class="author">Lyon</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="#" class="img"><img src="images/cont/mv_img6.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="#" class="title">Let Me Love You</a>
            <a href="#" class="author">Toulon </a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="#" class="img"><img src="images/cont/mv_img7.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="#" class="title">Let Me Love You</a>
            <a href="#" class="author">Perpignan</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
        <li class="item">
          <a href="#" class="img"><img src="images/cont/mv_img8.jpg" alt="#"><i class="icon-play"></i></a>
          <div class="info">
            <a href="#" class="title">Let Me Love You</a>
            <a href="#" class="author">Limoges</a>
            <span class="play-total"><i class="icon-sprite"></i>18.8万</span>
          </div>
        </li>
      </ul>
    </div>
  </div>

  <!-- footer -->
  <footer class="footer">
    <div class="footer-inner">
      <div class="footer-info">
        <div class="footer-info__download">
          <h3>下载Perrier客户端</h3>
          <ul class="list">
            <li><a href="#">
              <i class="footer-icon icon-pc"></i>
              PC版
            </a></li>
            <li><a href="#">
              <i class="footer-icon icon-mac"></i>
              Mac版
            </a></li>
            <li><a href="#">
              <i class="footer-icon icon-android"></i>
              Android版
            </a></li>
            <li><a href="#">
              <i class="footer-icon icon-iphone"></i>
              iPhone版
            </a></li>
          </ul>
        </div>
        <div class="footer-info__product">
          <h3>特色产品</h3>
          <ul class="list">
            <li class="hasPic"><a href="#">
              <i class="footer-icon icon-kg"></i>
             LIME
            </a></li>
            <li class="hasPic"><a href="#">
              <i class="footer-icon icon-ss"></i>
              LEMON
            </a></li>
            <li class="hasPic"><a href="#">
              <i class="footer-icon icon-qp"></i>
              GRAPEFRUIT
            </a></li>
            <li><a href="#">PERRIER平台</a></li>
            <li><a href="#">上传产品</a></li>
            <li><a href="#">上传产品</a></li>
            <li><a href="#">上传产品</a></li>
          </ul>
        </div>
        <div class="footer-info__link">
          <h3>特色产品</h3>
          <ul class="list">
            <li><a href="#">CJ E&M</a></li>
            <li><a href="#">我们视频</a></li>
            <li><a href="#">手机perrier空间</a></li>
            <li><a href="#">CJ E&M</a></li>
            <li><a href="#">我们视频</a></li>
            <li><a href="#">手机perrier空间</a></li>
            <li><a href="#">CJ E&M</a></li>
            <li><a href="#">我们视频</a></li>
            <li><a href="#">手机perrier空间</a></li>
            <li><a href="#">CJ E&M</a></li>
            <li><a href="#">我们视频</a></li>
            <li><a href="#">手机perrier空间</a></li>
          </ul>
        </div>
      </div>
      <div class="footer-copyright">
        <p><a href="#">关于我们</a><span>|</span><a href="#">关于我们</a><span>|</span><a href="#">关于我们</a><span>|</span><a href="#">关于我们</a><span>|</span><a href="#">关于我们</a><span>|</span><a href="#">关于我们</a><span>|</span><a href="#">关于我们</a><span>|</span><a href="#">关于我们</a></p>
        <p>Copyright © 1998 - 2017 kk. All Rights Reserved.</p>
        <p>我们公司 版权所有 我们网络文化经营许可证</p>
      </div>
    </div>
  </footer>


  <!-- 分享到 -->
  <ul class="slider-share">
    <li><a href="#">
      <i class="icon-sprite icon-add"></i>
      添加到
      <i class="icon-sprite icon-arrow"></i>
    </a></li>
    <li><a href="#">
      <i class="icon-sprite icon-share"></i>
      分享
      <i class="icon-sprite icon-arrow"></i>
    </a></li>
    <li><a href="#">
      <i class="icon-sprite icon-download"></i>
      下载
    </a></li>
  </ul>

  <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
  <script src="js/script.js"></script>

</body>
</html>