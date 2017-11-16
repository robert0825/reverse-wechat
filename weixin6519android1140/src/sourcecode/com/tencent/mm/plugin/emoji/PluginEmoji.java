package com.tencent.mm.plugin.emoji;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.SmileyPanel;
import com.tencent.mm.api.n;
import com.tencent.mm.api.o.a;
import com.tencent.mm.bt.f;
import com.tencent.mm.bt.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.ui.chat.k;
import com.tencent.mm.pluginsdk.ui.d.d.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.q;
import com.tencent.mm.view.SmileyPanelImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PluginEmoji
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.plugin.emoji.b.c
{
  private com.tencent.mm.pluginsdk.c.d kfO;
  private com.tencent.mm.plugin.emoji.b.b kfP;
  com.tencent.mm.pluginsdk.c.e kfQ;
  
  public PluginEmoji()
  {
    GMTrace.i(16407446159360L, 122245);
    GMTrace.o(16407446159360L, 122245);
  }
  
  public void configure(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(16407983030272L, 122249);
    d.a.a(g.bRE());
    GMTrace.o(16407983030272L, 122249);
  }
  
  public void dependency()
  {
    GMTrace.i(16407848812544L, 122248);
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    GMTrace.o(16407848812544L, 122248);
  }
  
  public void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(16408117248000L, 122250);
    if (parame.eR(""))
    {
      pin(d.apQ());
      if (parame.eR("")) {
        h.a(com.tencent.mm.plugin.emoji.b.a.class, new com.tencent.mm.kernel.c.d(new a()));
      }
    }
    com.tencent.mm.ui.f.b.c.a(new com.tencent.mm.ui.f.b.b()
    {
      public final com.tencent.mm.ui.f.b.a bP(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(20133330288640L, 150005);
        try
        {
          paramAnonymousString1 = com.tencent.mm.plugin.gif.b.aHd().cx(paramAnonymousString1, paramAnonymousString2);
          GMTrace.o(20133330288640L, 150005);
          return paramAnonymousString1;
        }
        catch (IOException paramAnonymousString1)
        {
          w.printErrStackTrace("MicroMsg.PluginEmoji", paramAnonymousString1, "", new Object[0]);
          GMTrace.o(20133330288640L, 150005);
        }
        return null;
      }
    });
    com.tencent.mm.ui.f.c.b.a(new com.tencent.mm.ui.f.c.a()
    {
      public final CharSequence a(Context paramAnonymousContext, CharSequence paramAnonymousCharSequence, int paramAnonymousInt)
      {
        GMTrace.i(16409593643008L, 122261);
        paramAnonymousContext = g.bRE().b(paramAnonymousContext, paramAnonymousCharSequence, paramAnonymousInt);
        GMTrace.o(16409593643008L, 122261);
        return paramAnonymousContext;
      }
      
      public final int aM(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(16409862078464L, 122263);
        g.bRE();
        Object localObject = f.bRB();
        if (bg.nm(paramAnonymousString))
        {
          GMTrace.o(16409862078464L, 122263);
          return paramAnonymousInt;
        }
        int j = paramAnonymousString.length();
        if ((paramAnonymousInt == 0) || (paramAnonymousInt == j))
        {
          GMTrace.o(16409862078464L, 122263);
          return paramAnonymousInt;
        }
        if (f.voa == null)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          int k = ((f)localObject).vnQ.length;
          i = 0;
          while (i < k)
          {
            localStringBuilder.append(Pattern.quote(localObject.vnQ[i]));
            if (i != k - 1) {
              localStringBuilder.append('|');
            }
            i += 1;
          }
          k = ((f)localObject).vnR.length;
          i = 0;
          while (i < k)
          {
            localStringBuilder.append(Pattern.quote(localObject.vnR[i]));
            if (i != k - 1) {
              localStringBuilder.append('|');
            }
            i += 1;
          }
          k = ((f)localObject).vnS.length;
          i = 0;
          while (i < k)
          {
            localStringBuilder.append(Pattern.quote(localObject.vnS[i]));
            if (i != k - 1) {
              localStringBuilder.append('|');
            }
            i += 1;
          }
          k = ((f)localObject).vnT.length;
          i = 0;
          while (i < k)
          {
            localStringBuilder.append(Pattern.quote(localObject.vnT[i]));
            if (i != k - 1) {
              localStringBuilder.append('|');
            }
            i += 1;
          }
          k = ((f)localObject).vnU.length;
          i = 0;
          while (i < k)
          {
            localStringBuilder.append(Pattern.quote(localObject.vnU[i]));
            if (i != k - 1) {
              localStringBuilder.append('|');
            }
            i += 1;
          }
          k = ((f)localObject).vnV.length;
          i = 0;
          while (i < k)
          {
            localStringBuilder.append(Pattern.quote(localObject.vnV[i]));
            if (i != k - 1) {
              localStringBuilder.append('|');
            }
            i += 1;
          }
          if ((((f)localObject).vnW != null) && (!((f)localObject).vnW.isEmpty()))
          {
            localObject = ((f)localObject).vnW.iterator();
            while (((Iterator)localObject).hasNext())
            {
              q localq = (q)((Iterator)localObject).next();
              localStringBuilder.append(Pattern.quote(localq.field_key)).append("|");
              if (!bg.nm(localq.field_cnValue)) {
                localStringBuilder.append(Pattern.quote(localq.field_cnValue)).append("|");
              }
              if (!bg.nm(localq.field_enValue)) {
                localStringBuilder.append(Pattern.quote(localq.field_enValue)).append("|");
              }
              if (!bg.nm(localq.field_qqValue)) {
                localStringBuilder.append(Pattern.quote(localq.field_qqValue)).append("|");
              }
              if (!bg.nm(localq.field_twValue)) {
                localStringBuilder.append(Pattern.quote(localq.field_twValue)).append("|");
              }
              if (!bg.nm(localq.field_thValue)) {
                localStringBuilder.append(Pattern.quote(localq.field_thValue)).append("|");
              }
            }
          }
          f.voa = Pattern.compile(localStringBuilder.toString());
        }
        if (paramAnonymousInt < 6)
        {
          i = 0;
          if (paramAnonymousInt + 6 < j) {
            break label740;
          }
          j -= 1;
          label662:
          paramAnonymousString = paramAnonymousString.substring(i, j);
          paramAnonymousString = f.voa.matcher(paramAnonymousString);
          do
          {
            if (!paramAnonymousString.find()) {
              break;
            }
          } while ((6 <= paramAnonymousString.start()) || (6 >= paramAnonymousString.end()));
        }
        for (int i = paramAnonymousString.start();; i = 6)
        {
          if (i - 6 > 0) {
            i -= 6;
          }
          for (;;)
          {
            GMTrace.o(16409862078464L, 122263);
            return paramAnonymousInt + i;
            i = paramAnonymousInt - 6;
            break;
            label740:
            j = paramAnonymousInt + 6;
            break label662;
            i = 0;
          }
        }
      }
      
      public final CharSequence c(Context paramAnonymousContext, CharSequence paramAnonymousCharSequence, float paramAnonymousFloat)
      {
        GMTrace.i(16409727860736L, 122262);
        paramAnonymousContext = g.bRE().a(paramAnonymousContext, paramAnonymousCharSequence, paramAnonymousFloat);
        GMTrace.o(16409727860736L, 122262);
        return paramAnonymousContext;
      }
    });
    com.tencent.mm.api.o.eqQ = new o.a()
    {
      public final SmileyPanel af(Context paramAnonymousContext)
      {
        GMTrace.i(20133732941824L, 150008);
        paramAnonymousContext = new SmileyPanelImpl(paramAnonymousContext);
        GMTrace.o(20133732941824L, 150008);
        return paramAnonymousContext;
      }
      
      public final n oN()
      {
        GMTrace.i(20133867159552L, 150009);
        k localk = new k();
        GMTrace.o(20133867159552L, 150009);
        return localk;
      }
    };
    GMTrace.o(16408117248000L, 122250);
  }
  
  public com.tencent.mm.pluginsdk.c.d getEmojiMgr()
  {
    GMTrace.i(16408519901184L, 122253);
    if (this.kfO == null) {
      this.kfO = this.kfP.aqq();
    }
    com.tencent.mm.pluginsdk.c.d locald = this.kfO;
    GMTrace.o(16408519901184L, 122253);
    return locald;
  }
  
  public com.tencent.mm.pluginsdk.c.e getProvider()
  {
    GMTrace.i(20133196070912L, 150004);
    if (this.kfQ == null) {
      this.kfQ = new com.tencent.mm.bq.a();
    }
    com.tencent.mm.pluginsdk.c.e locale = this.kfQ;
    GMTrace.o(20133196070912L, 150004);
    return locale;
  }
  
  public void installed()
  {
    GMTrace.i(16407714594816L, 122247);
    alias(com.tencent.mm.plugin.emoji.b.c.class);
    GMTrace.o(16407714594816L, 122247);
  }
  
  public String name()
  {
    GMTrace.i(16407580377088L, 122246);
    GMTrace.o(16407580377088L, 122246);
    return "plugin-emoji";
  }
  
  public void removeEmojiMgr()
  {
    GMTrace.i(16408385683456L, 122252);
    this.kfO = null;
    GMTrace.o(16408385683456L, 122252);
  }
  
  public void setEmojiMgr()
  {
    GMTrace.i(16408251465728L, 122251);
    if (this.kfO == null) {
      this.kfO = this.kfP.aqq();
    }
    GMTrace.o(16408251465728L, 122251);
  }
  
  public void setEmojiMgrProvider(com.tencent.mm.plugin.emoji.b.b paramb)
  {
    GMTrace.i(16408654118912L, 122254);
    this.kfP = paramb;
    GMTrace.o(16408654118912L, 122254);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\PluginEmoji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */