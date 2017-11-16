package org.a.a.a;

import org.a.d.i;

public class c
  extends b
{
  public final String b(i parami)
  {
    return String.format("https://api.twitter.com/oauth/authorize?oauth_token=%s", new Object[] { parami.token });
  }
  
  public String ctt()
  {
    return "http://api.twitter.com/oauth/request_token";
  }
  
  public String ctu()
  {
    return "http://api.twitter.com/oauth/access_token";
  }
  
  public static class a
    extends c
  {
    public final String ctt()
    {
      return "https://api.twitter.com/oauth/request_token";
    }
    
    public final String ctu()
    {
      return "https://api.twitter.com/oauth/access_token";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\org\a\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */