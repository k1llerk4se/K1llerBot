import org.jibble.pircbot.PircBot;

public class MainBot extends PircBot {
	String game;
	String owner = "k1llerk4se";
    public MainBot() {
      this.setName("k1llerbot");
    }
	public void setGame(String thing){
		if(thing != null){
			game = thing;
		}
	}
    public void onMessage(String channel, String sender,
                          String login, String hostname, String message) {
        if(message.contains("adblock")) {
            if (message.equalsIgnoreCase("!adblock")) {
                sendMessage(channel, "Hey don't mention Adblock in this channel, We all know it exist but it hurts us as streamers and content creators.");
            }
            else {
                sendMessage(channel, ".timeout " + sender);
                sendMessage(channel, ".unban " + sender);
                sendMessage(channel, "Hey " + sender + " don't mention Adblock in this channel, We all know it exist but it hurts us as streamers and content creators.");
            }
        }
        if(message.equalsIgnoreCase("!age")){
            sendMessage(channel ,"I'm 21, so stop asking!");
        }
        if (message.equalsIgnoreCase("!botderp")){
            sendMessage(channel, "K1llerbot you just done derped boy.");
        }
        if (message.equalsIgnoreCase("!badbot")){
            sendMessage(channel, "/me hides in a corner");
        }
        if(message.equalsIgnoreCase("!bttv")){
            sendMessage(channel, "If you don't have it already, download http://nightdev.com/betterttv/ . It's an awesome add-on for your browser which greatly improves your twitch experience.");
        }
	    if(message.equalsIgnoreCase("!chatrules")){
		    sendMessage(channel, "Please keep the chat polite ~ Do NOT ask for mod! ~ Respect the streamer, moderators and other viewers or you will be banned ~ Do NOT talk about age | politics | X-rated materials ~ Do NOT self - advertise this will result in a BAN..... If the rules are not followed or are blatantly trolled and ignored you will get insta-banned.");
	    }
        if(message.equalsIgnoreCase("!commands")){
            sendMessage(channel, "The list of commands for this bot can be found here: https://github.com/k1llerk4se/K1llerBot/wiki/Commands");
        }
	    if(message.equalsIgnoreCase("!cookies")){
		    sendMessage(channel, "Get your own damn cookies man! |∴◉ ϖ ◉∴|");
	    }
	    if(message.equalsIgnoreCase("!crash")){
            sendMessage(channel, "Oops it looks like Mikel broke his game AGAIN, get out the popcorn");
        }
	    if(message.equalsIgnoreCase("!cyrpto")){
		    sendMessage(channel, "Blockchain: 1Do84zVeeyENr7zQYyMmf3H7PtJ8EoszjW. Coinbase: 53801ee08a7564e74d000066. Doge: 82d1fd4b-84a7-fd03-5746-aad41350e7e0. DogeTip: D6AXcpFNBQoXyG1BpiuJMPoRbr6DyXfzwR.");
	    }
        if(message.equalsIgnoreCase("!dnt")){
            sendMessage(channel, "/me passes the piggy bank https://imraising.tv/u/k1llerk4se/");
        }
	    if(message.equalsIgnoreCase("!doc")){
		    sendMessage(channel, "Go to DOCs' stream: http://www.twitch.tv/calsafuric");
	    }
	    if(message.equalsIgnoreCase("!game")){
		    if(message.split(" ") != null){
			    String name = message.split(" ")[0];
			    setGame(name);
		    }else{
			    if(game != null){
					sendMessage(channel, "The current game is:" + game);
			    }else{
				    sendMessage(channel, "No game is currently set");
			    }

		    }
	    }
        if (message.equalsIgnoreCase("!GG")){
            sendMessage(channel, "http://www.myinstants.com/instant/gg/");
        }
        if(message.equalsIgnoreCase("!k1llerbot")){
            sendMessage(channel, "/me is special");
            sendMessage(channel, "I am custom written chat bot written by k1llerk4se for his channel.");
        }
        if(message.equalsIgnoreCase("!nightbot")){
            sendMessage(channel, "/me Fucks Nightbot");
	        sendMessage(channel, "I'm K1llerbot");
        }
        if (message.equalsIgnoreCase("!pif")){
            sendMessage(channel, "Every 50 dollars of donations, I will give away a game on steam. #playitforward.");
        }
        if (message.equalsIgnoreCase("!riot")) {
            sendMessage(channel, "༼ つ◕_◕༽つ Death or Riot ༼ つ◕_◕༽つ");
        }
        if (message.equalsIgnoreCase("!riot1")) {
            String riot = message.split(" ")[2];
            sendMessage(channel, "༼ つ◕_◕༽つ" + riot + "or Riot ༼ つ◕_◕༽つ");
        }
	    if(message.equalsIgnoreCase("!sadface")){
		    sendMessage(channel, "http://i.imgur.com/2qVC8lf.gif?1");
	    }
        if (message.equalsIgnoreCase("!twitter")) {
            sendMessage(channel, "Follow me on twitter https://twitter.com/k1llerk4se");
        }
        if (message.contains("GG")){
            sendMessage(channel, "http://www.myinstants.com/instant/gg/");
        }
        if (message.equalsIgnoreCase("hey")|| message.equalsIgnoreCase("hi") || message.equalsIgnoreCase("hello")){
            sendMessage(channel, "o/ Heyo \\o. " + sender + " how are you tonight?");
        }
        if (message.contains("***") || message.contains("dick") || message.contains("Dick") || message.contains("DIck") || message.contains("gay")) {
            sendMessage(channel, ".timeout " + sender);
            sendMessage(channel, ".unban " + sender);
            sendMessage(channel, "HEY! " + sender + " Just because I curse that dosen't mean you should so stop it.");
        }
	    if(message.contains("http:") || message.contains("www.") || message.contains(".com") || message.contains(".me") || message.contains(".edu") || message.contains(".tv") || message.contains(".net") || message.contains(".org") || message.contains("https:")){
		    if(sender != owner) {
			    sendMessage(channel, ".timeout " + sender);
			    sendMessage(channel, ".unban " + sender);
			    sendMessage(channel, "HEY! " + sender + " NO LINKS IN THE COMS! THEY WILL BE DELETED! LINKS ARE ONLY ALLOWED IN THE COMS WITH MIKEL'S APPROVAL");
		    }else{

		    }
		}
    }
}
