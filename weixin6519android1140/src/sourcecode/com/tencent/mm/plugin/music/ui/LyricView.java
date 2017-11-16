package com.tencent.mm.plugin.music.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.music.a.a.a;
import com.tencent.mm.plugin.music.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public class LyricView
  extends View
{
  public static int nsu;
  public static int nsv;
  private long gpI;
  private int height;
  private GestureDetector mHA;
  private float mYN;
  private float mps;
  com.tencent.mm.plugin.music.a.a nso;
  TextPaint nsp;
  TextPaint nsq;
  private int nsr;
  private int nss;
  private int nst;
  private int nsw;
  private boolean nsx;
  private boolean nsy;
  private int nsz;
  private int width;
  private int yOffset;
  
  static
  {
    GMTrace.i(4873177268224L, 36308);
    nsu = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 16);
    nsv = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 10);
    GMTrace.o(4873177268224L, 36308);
  }
  
  public LyricView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(4872237744128L, 36301);
    this.nst = -1;
    this.nsw = (nsu + nsv);
    this.yOffset = this.nsw;
    MP();
    GMTrace.o(4872237744128L, 36301);
  }
  
  public LyricView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4872371961856L, 36302);
    this.nst = -1;
    this.nsw = (nsu + nsv);
    this.yOffset = this.nsw;
    MP();
    GMTrace.o(4872371961856L, 36302);
  }
  
  private void MP()
  {
    GMTrace.i(4872506179584L, 36303);
    this.nsp = new TextPaint();
    this.nsp.setTextSize(nsu);
    this.nsp.setColor(-1);
    this.nsp.setAntiAlias(true);
    this.nsp.setTextAlign(Paint.Align.CENTER);
    this.nsq = new TextPaint();
    this.nsq.setTextSize(nsu);
    this.nsq.setColor(-1);
    this.nsq.setAlpha(127);
    this.nsq.setAntiAlias(true);
    this.nsq.setTextAlign(Paint.Align.CENTER);
    this.mHA = new GestureDetector(getContext(), new a((byte)0));
    GMTrace.o(4872506179584L, 36303);
  }
  
  public final void cU(long paramLong)
  {
    GMTrace.i(4872103526400L, 36300);
    if (this.gpI != paramLong)
    {
      this.gpI = paramLong;
      if ((this.nso == null) || (this.nso.npu.size() == 0))
      {
        GMTrace.o(4872103526400L, 36300);
        return;
      }
      int j = -1;
      int i = 0;
      while ((i < this.nso.npu.size()) && (this.nso.ri(i).timestamp < paramLong))
      {
        if (!this.nso.ri(i).npA) {
          j = i;
        }
        i += 1;
      }
      if ((!this.nsy) && (j != this.nst))
      {
        this.nst = j;
        this.nsr = ((nsu + nsv) * this.nst);
        this.nss = ((nsu + nsv) * (this.nso.npu.size() - this.nst - 1));
        if (this.yOffset == 0) {
          this.yOffset = (-this.nsw);
        }
        this.nsx = true;
        invalidate();
      }
    }
    GMTrace.o(4872103526400L, 36300);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(4872640397312L, 36304);
    super.onDraw(paramCanvas);
    if (this.nso == null)
    {
      w.v("MicroMsg.Music.LyricView", "lyricObj is null");
      GMTrace.o(4872640397312L, 36304);
      return;
    }
    if ((this.height == 0) || (this.width == 0))
    {
      this.height = getMeasuredHeight();
      this.width = getMeasuredWidth();
    }
    if (this.nst < 0)
    {
      GMTrace.o(4872640397312L, 36304);
      return;
    }
    int i = this.yOffset;
    if ((this.nso == null) || (this.nso.npu.size() <= this.nst)) {
      if (this.nsx) {
        if (this.yOffset == 0) {
          break label377;
        }
      }
    }
    label377:
    for (i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.yOffset = ((int)(this.yOffset * 0.9F));
        invalidate();
      }
      GMTrace.o(4872640397312L, 36304);
      return;
      int j = this.height / 2 - i;
      if ((j < this.height) && (j > 0)) {
        paramCanvas.drawText(this.nso.ri(this.nst).content, this.width / 2, j, this.nsp);
      }
      i = this.nst - 1;
      int k;
      while (i >= 0)
      {
        k = j - (this.nst - i) * (nsu + nsv);
        if ((k > 0) && (k < this.height)) {
          paramCanvas.drawText(this.nso.ri(i).content, this.width / 2, k, this.nsq);
        }
        i -= 1;
      }
      i = this.nst + 1;
      while (i < this.nso.npu.size())
      {
        k = (i - this.nst) * (nsu + nsv) + j;
        if ((k < this.height) && (k > 0)) {
          paramCanvas.drawText(this.nso.ri(i).content, this.width / 2, k, this.nsq);
        }
        i += 1;
      }
      break;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(4872774615040L, 36305);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.height = paramInt2;
    this.width = paramInt1;
    GMTrace.o(4872774615040L, 36305);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(4872908832768L, 36306);
    this.mHA.onTouchEvent(paramMotionEvent);
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      GMTrace.o(4872908832768L, 36306);
      return true;
      this.mps = paramMotionEvent.getY();
      this.mYN = paramMotionEvent.getX();
      this.nsz = this.yOffset;
      this.nsy = true;
      this.nsx = false;
      continue;
      int k = (int)(paramMotionEvent.getX() - this.mYN);
      int m = (int)(paramMotionEvent.getY() - this.mps);
      int i = this.nsz - m;
      if (i > 0)
      {
        if (i > this.nss) {}
        for (j = this.nss;; j = i)
        {
          this.yOffset = j;
          invalidate();
          w.d("MicroMsg.Music.LyricView", "xDistance: %d yDisntance: %d tempYOffset: %d baseYOffset: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(this.nsz) });
          break;
        }
      }
      if (i < -this.nsr) {}
      for (int j = -this.nsr;; j = i)
      {
        this.yOffset = j;
        break;
      }
      this.nsy = false;
    }
  }
  
  private final class a
    extends GestureDetector.SimpleOnGestureListener
  {
    private a()
    {
      GMTrace.i(4880290807808L, 36361);
      GMTrace.o(4880290807808L, 36361);
    }
    
    public final void onLongPress(MotionEvent paramMotionEvent)
    {
      GMTrace.i(4880425025536L, 36362);
      paramMotionEvent = LyricView.a(LyricView.this, paramMotionEvent.getX(), paramMotionEvent.getY());
      if (!bg.nm(paramMotionEvent))
      {
        if (h.aSr().nqe == null) {
          h.aSr().nqe = ((ClipboardManager)ab.getContext().getSystemService("clipboard"));
        }
        h.aSr().nqe.setPrimaryClip(ClipData.newPlainText("MicroMsg.Music", paramMotionEvent));
        Toast.makeText(LyricView.this.getContext(), LyricView.this.getContext().getString(R.l.dKq, new Object[] { paramMotionEvent }), 0).show();
        GMTrace.o(4880425025536L, 36362);
        return;
      }
      w.i("MicroMsg.Music.LyricView", "onLongPress not found sentence");
      GMTrace.o(4880425025536L, 36362);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\ui\LyricView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */