package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.gif.MMGIFException;
import com.tencent.mm.plugin.gif.b;
import com.tencent.mm.plugin.gif.c;
import com.tencent.mm.plugin.gif.f;
import com.tencent.mm.plugin.m.a.c;
import com.tencent.mm.pluginsdk.c.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.IOException;

public class MMEmojiView
  extends MMAnimateView
{
  private EmojiInfo koe;
  private int mScreenWidth;
  int tBW;
  private int tBX;
  boolean tBY;
  public boolean tBZ;
  
  public MMEmojiView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(1195611521024L, 8908);
    init(paramContext);
    GMTrace.o(1195611521024L, 8908);
  }
  
  public MMEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(1195745738752L, 8909);
    init(paramContext);
    GMTrace.o(1195745738752L, 8909);
  }
  
  public MMEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1195879956480L, 8910);
    this.tBY = false;
    this.tBZ = false;
    init(paramContext);
    GMTrace.o(1195879956480L, 8910);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(1196014174208L, 8911);
    this.tBW = paramContext.getResources().getDimensionPixelSize(a.c.kbm);
    this.tBX = paramContext.getResources().getDimensionPixelSize(a.c.kvN);
    this.mScreenWidth = com.tencent.mm.br.a.ef(paramContext);
    GMTrace.o(1196014174208L, 8911);
  }
  
  public final void a(EmojiInfo paramEmojiInfo, String paramString)
  {
    GMTrace.i(1196148391936L, 8912);
    this.koe = paramEmojiInfo;
    String str = paramEmojiInfo.bUU();
    if ((paramEmojiInfo.field_reserved4 & EmojiInfo.vCJ) == EmojiInfo.vCJ)
    {
      if (b.aHd().zY(paramString) != null)
      {
        setImageDrawable(b.aHd().zY(paramString));
        GMTrace.o(1196148391936L, 8912);
        return;
      }
      a(this.koe, ((PluginEmoji)h.j(PluginEmoji.class)).getProvider().a(this.koe), paramString);
      GMTrace.o(1196148391936L, 8912);
      return;
    }
    cy(str, paramString);
    GMTrace.o(1196148391936L, 8912);
  }
  
  public final void a(EmojiInfo paramEmojiInfo, byte[] paramArrayOfByte, String paramString)
  {
    GMTrace.i(1196282609664L, 8913);
    this.koe = paramEmojiInfo;
    for (;;)
    {
      try
      {
        if (bg.bq(paramArrayOfByte)) {
          continue;
        }
        if (!bg.nm(paramString))
        {
          this.kgw = paramString;
          paramString = b.aHd().o(this.kgw, paramArrayOfByte);
          setImageDrawable(paramString);
          GMTrace.o(1196282609664L, 8913);
          return;
        }
        if ((!o.bk(paramArrayOfByte)) || (!((PluginEmoji)h.j(PluginEmoji.class)).getProvider().aqK())) {
          continue;
        }
        paramEmojiInfo = new f(paramArrayOfByte);
        this.tBZ = true;
      }
      catch (MMGIFException paramEmojiInfo)
      {
        a(paramEmojiInfo);
        if (paramEmojiInfo.getErrorCode() != 103) {
          continue;
        }
        w.d("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray D_GIF_ERR_NOT_GIF_FILE");
        paramEmojiInfo = d.bg(paramArrayOfByte);
        if (paramEmojiInfo == null) {
          continue;
        }
        paramEmojiInfo.setDensity(320);
        setImageBitmap(paramEmojiInfo);
        GMTrace.o(1196282609664L, 8913);
        return;
        w.v("MicroMsg.emoji.MMEmojiView", "set with gif");
        paramEmojiInfo = new c(paramArrayOfByte);
        continue;
      }
      catch (IOException paramEmojiInfo)
      {
        w.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", new Object[] { paramEmojiInfo.toString() });
        if (this.koe == null) {
          continue;
        }
        this.koe.bUO();
        w.i("MicroMsg.emoji.MMEmojiView", "delete file.");
        init();
        GMTrace.o(1196282609664L, 8913);
        return;
        w.w("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", new Object[] { paramArrayOfByte.toString() });
        if (this.koe == null) {
          continue;
        }
        this.koe.bUO();
        w.i("MicroMsg.emoji.MMEmojiView", "delete file.");
        init();
        GMTrace.o(1196282609664L, 8913);
        return;
        w.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", new Object[] { paramEmojiInfo.toString() });
        if (this.koe == null) {
          continue;
        }
        this.koe.bUO();
        w.i("MicroMsg.emoji.MMEmojiView", "delete file.");
        continue;
      }
      catch (NullPointerException paramEmojiInfo)
      {
        w.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", new Object[] { paramEmojiInfo.toString() });
        continue;
      }
      paramString = paramEmojiInfo;
      if (!paramEmojiInfo.isRunning())
      {
        paramEmojiInfo.reset();
        paramString = paramEmojiInfo;
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j = 0;
    GMTrace.i(1196416827392L, 8914);
    super.onMeasure(paramInt1, paramInt2);
    int i;
    label35:
    float f;
    if (getDrawable() == null)
    {
      i = 0;
      if (getDrawable() != null) {
        break label237;
      }
      paramInt2 = i;
      paramInt1 = j;
      if (this.koe != null)
      {
        paramInt2 = i;
        paramInt1 = j;
        if (i == 0)
        {
          paramInt2 = i;
          paramInt1 = j;
          if (j == 0)
          {
            paramInt2 = (int)(this.koe.field_width * aHe());
            paramInt1 = (int)(this.koe.field_height * aHe());
          }
        }
      }
      if (paramInt1 >= this.tBX)
      {
        i = paramInt2;
        j = paramInt1;
        if (paramInt2 >= this.tBX) {}
      }
      else
      {
        if (paramInt2 >= paramInt1) {
          break label249;
        }
        f = this.tBX / paramInt2;
        i = this.tBX;
        j = (int)(paramInt1 * f);
      }
      label149:
      if (!this.tBY) {
        break label339;
      }
      if (i <= this.tBW)
      {
        paramInt1 = i;
        paramInt2 = j;
        if (j <= this.tBW) {}
      }
      else
      {
        if (i <= j) {
          break label294;
        }
        f = this.tBW / i;
        paramInt1 = this.tBW;
        paramInt2 = (int)(j * f);
      }
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2);
      GMTrace.o(1196416827392L, 8914);
      return;
      i = getDrawable().getIntrinsicWidth();
      break;
      label237:
      j = getDrawable().getIntrinsicHeight();
      break label35;
      label249:
      if (paramInt1 < paramInt2)
      {
        f = this.tBX / paramInt1;
        j = this.tBX;
        i = (int)(paramInt2 * f);
        break label149;
      }
      j = this.tBX;
      i = this.tBX;
      break label149;
      label294:
      if (j > i)
      {
        f = this.tBW / j;
        paramInt2 = this.tBW;
        paramInt1 = (int)(i * f);
      }
      else
      {
        paramInt1 = this.tBW;
        paramInt2 = this.tBW;
        continue;
        label339:
        if (i <= this.mScreenWidth)
        {
          paramInt1 = i;
          paramInt2 = j;
          if (j <= this.mScreenWidth) {}
        }
        else if (i > j)
        {
          f = this.mScreenWidth / i;
          paramInt1 = this.mScreenWidth;
          paramInt2 = (int)(j * f);
        }
        else if (j > i)
        {
          f = this.mScreenWidth / j;
          paramInt2 = this.mScreenWidth;
          paramInt1 = (int)(i * f);
        }
        else
        {
          paramInt1 = this.mScreenWidth;
          paramInt2 = this.mScreenWidth;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\emoji\MMEmojiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */