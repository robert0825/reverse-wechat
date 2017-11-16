package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class bi
{
  public ListView mqO;
  public SnsCommentFooter pPb;
  public int pYK;
  public int pZZ;
  int position;
  int qkg;
  int qkh;
  public int qki;
  boolean qkj;
  public int qkk;
  protected long qkl;
  Runnable qkm;
  Runnable qkn;
  Runnable qko;
  
  public bi(ListView paramListView, SnsCommentFooter paramSnsCommentFooter)
  {
    GMTrace.i(8395587321856L, 62552);
    this.position = -1;
    this.qkg = -1;
    this.qkh = -1;
    this.pYK = -1;
    this.qki = 0;
    this.pZZ = -1;
    this.qkj = false;
    this.qkm = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8430081277952L, 62809);
        if ((bi.this.mqO != null) && (bi.this.mqO.getCount() > bi.this.position))
        {
          int j = bi.this.pPb.getTop();
          w.d("MicroMsg.TimeLineScrollAnimation", "limitCount: " + bi.this.qkk + " footerHeight:" + bi.this.pPb.getHeight() + " listOriginalBottom: " + bi.this.pYK);
          bi localbi = bi.this;
          int i = localbi.qkk;
          localbi.qkk = (i - 1);
          if ((i > 0) && ((bi.this.pZZ != j) || (j > bi.this.pYK - 200) || (bi.this.mqO.getBottom() > bi.this.pYK - bi.this.pPb.getHeight() - 150)))
          {
            i = 10;
            if (bi.this.qkk == 0) {
              i = 200;
            }
            new ae().postDelayed(this, i);
          }
          bi.this.pZZ = j;
          i = bi.this.pZZ - bi.this.qki - bi.this.qkg;
          w.d("MicroMsg.TimeLineScrollAnimation", "itemH:" + bi.this.qkg + " footerTop" + bi.this.pZZ + " list.bottom:" + bi.this.mqO.getBottom() + " position: " + bi.this.position + " topselection: " + i);
          w.d("MicroMsg.TimeLineScrollAnimation", "list.getTop(): " + bi.this.mqO.getTop() + " marginTop: " + bi.this.qki + " footerTop " + bi.this.pZZ);
          bi.this.mqO.setSelectionFromTop(bi.this.position + bi.this.mqO.getHeaderViewsCount(), i);
        }
        GMTrace.o(8430081277952L, 62809);
      }
    };
    this.qkn = new Runnable()
    {
      int offset;
      
      public final void run()
      {
        GMTrace.i(8400284942336L, 62587);
        if ((bi.this.mqO != null) && (bi.this.mqO.getCount() > bi.this.position))
        {
          bi.this.pZZ = bi.this.pPb.getTop();
          int i = bi.this.pZZ - bi.this.qki - bi.this.qkg;
          w.d("MicroMsg.TimeLineScrollAnimation", "itemH:" + bi.this.qkg + " footerTop" + bi.this.pZZ + " list.bottom:" + bi.this.mqO.getBottom() + " position: " + bi.this.position + " topselection: " + i);
          w.d("MicroMsg.TimeLineScrollAnimation", "list.getTop(): " + bi.this.mqO.getTop() + " marginTop: " + bi.this.qki + " footerTop " + bi.this.pZZ);
          if (i == this.offset)
          {
            bi.this.mqO.setSelectionFromTop(bi.this.position + bi.this.mqO.getHeaderViewsCount(), i);
            this.offset = 0;
            bi.this.qkk = 0;
            GMTrace.o(8400284942336L, 62587);
            return;
          }
          bi localbi = bi.this;
          int j = localbi.qkk;
          localbi.qkk = (j - 1);
          if (j > 0)
          {
            new ae().postDelayed(this, 100L);
            this.offset = i;
            GMTrace.o(8400284942336L, 62587);
            return;
          }
          this.offset = 0;
          bi.this.qkk = 0;
        }
        GMTrace.o(8400284942336L, 62587);
      }
    };
    this.qko = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8621073104896L, 64232);
        w.d("MicroMsg.TimeLineScrollAnimation", "originalTop:" + bi.this.qkh + " position:" + bi.this.position + " list.bottom:" + bi.this.mqO.getBottom());
        GMTrace.o(8621073104896L, 64232);
      }
    };
    this.mqO = paramListView;
    this.pPb = paramSnsCommentFooter;
    GMTrace.o(8395587321856L, 62552);
  }
  
  public final void bpU()
  {
    GMTrace.i(8395721539584L, 62553);
    this.qkj = true;
    new ae().postDelayed(this.qkm, 30L);
    this.qkk = 10;
    w.e("MicroMsg.TimeLineScrollAnimation", "footerTop when up :" + this.pPb.getTop());
    this.qkl = bg.Pw();
    GMTrace.o(8395721539584L, 62553);
  }
  
  public final void bpV()
  {
    GMTrace.i(8395855757312L, 62554);
    this.qkj = true;
    this.qkk = 20;
    new ae().postDelayed(this.qkn, 100L);
    GMTrace.o(8395855757312L, 62554);
  }
  
  public final void bpW()
  {
    GMTrace.i(8395989975040L, 62555);
    if (this.qkj)
    {
      this.qkj = false;
      new ae().postDelayed(this.qko, 30L);
      this.qkk = 10;
    }
    GMTrace.o(8395989975040L, 62555);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */