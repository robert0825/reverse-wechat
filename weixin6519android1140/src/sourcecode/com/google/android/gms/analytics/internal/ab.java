package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

abstract class ab<T extends aa>
  extends n
{
  a<T> aea;
  
  public ab(q paramq, a<T> parama)
  {
    super(paramq);
    this.aea = parama;
  }
  
  private T a(XmlResourceParser paramXmlResourceParser)
  {
    for (;;)
    {
      try
      {
        paramXmlResourceParser.next();
        i = paramXmlResourceParser.getEventType();
        if (i == 1) {
          continue;
        }
        if (paramXmlResourceParser.getEventType() == 2)
        {
          str1 = paramXmlResourceParser.getName().toLowerCase();
          if (!str1.equals("screenname")) {
            continue;
          }
          str1 = paramXmlResourceParser.getAttributeValue(null, "name");
          str2 = paramXmlResourceParser.nextText().trim();
          if (!TextUtils.isEmpty(str1)) {
            TextUtils.isEmpty(str2);
          }
        }
      }
      catch (XmlPullParserException paramXmlResourceParser)
      {
        f("Error parsing tracker configuration file", paramXmlResourceParser);
        return this.aea.jg();
        if (!str1.equals("bool")) {
          continue;
        }
        String str2 = paramXmlResourceParser.getAttributeValue(null, "name");
        str1 = paramXmlResourceParser.nextText().trim();
        if (TextUtils.isEmpty(str2)) {
          continue;
        }
        bool = TextUtils.isEmpty(str1);
        if (bool) {
          continue;
        }
        try
        {
          bool = Boolean.parseBoolean(str1);
          this.aea.b(str2, bool);
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          c("Error parsing bool configuration value", str1, localNumberFormatException1);
        }
        continue;
      }
      catch (IOException paramXmlResourceParser)
      {
        int i;
        f("Error parsing tracker configuration file", paramXmlResourceParser);
        continue;
        if (!str1.equals("integer")) {
          continue;
        }
        String str3 = paramXmlResourceParser.getAttributeValue(null, "name");
        String str1 = paramXmlResourceParser.nextText().trim();
        if (TextUtils.isEmpty(str3)) {
          continue;
        }
        boolean bool = TextUtils.isEmpty(str1);
        if (bool) {
          continue;
        }
        try
        {
          i = Integer.parseInt(str1);
          this.aea.e(str3, i);
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          c("Error parsing int configuration value", str1, localNumberFormatException2);
        }
        continue;
      }
      i = paramXmlResourceParser.next();
      continue;
      if (!str1.equals("string")) {
        continue;
      }
      str1 = paramXmlResourceParser.getAttributeValue(null, "name");
      str2 = paramXmlResourceParser.nextText().trim();
      if ((!TextUtils.isEmpty(str1)) && (str2 != null)) {
        this.aea.g(str1, str2);
      }
    }
  }
  
  public final T bO(int paramInt)
  {
    try
    {
      aa localaa = a(this.ack.acR.getResources().getXml(paramInt));
      return localaa;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      e("inflate() called with unknown resourceId", localNotFoundException);
    }
    return null;
  }
  
  public static abstract interface a<U extends aa>
  {
    public abstract void b(String paramString, boolean paramBoolean);
    
    public abstract void e(String paramString, int paramInt);
    
    public abstract void g(String paramString1, String paramString2);
    
    public abstract U jg();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */