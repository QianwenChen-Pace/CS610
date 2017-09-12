<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="Header.jsp"/>



		<div id="navigation">


			Customer

			<hr />


			<a href="CustomerPageGenreId.jsp" class="navigation">Genre</a>
			<a href="CustomerPageArtist.jsp" class="navigation">Artist</a>
			<a href="CustomerPagePlaylist.jsp" class="navigation">Playlist</a>
            <a href="CustomerPageAlbum.jsp" class="navigation">Album</a>
            <a href="CustomerPageTrack.jsp" class="navigation">Track</a>
            <a href="MediaType.jsp" class="navigation">MediaType</a>
            

		</div>

<br><br>

		<div id="content">

			<h1>Customer</h1>
             
             <br>
             <br>

			<input type="button" value="Back" onclick="history.go(-1);"/>

		</div>






</div>

</body>

</html>
