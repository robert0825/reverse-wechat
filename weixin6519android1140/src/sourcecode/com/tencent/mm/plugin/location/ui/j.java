package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.p;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class j
{
  public TextView EN;
  public Context context;
  private String jQt;
  public boolean mAe;
  private ViewGroup mAg;
  ArrayList<String> mAh;
  private final int mAi;
  private final int mAj;
  private final int mAk;
  private final int mAl;
  private final int mAm;
  private final int mAn;
  private final int mAo;
  private final int mAp;
  private final int mAq;
  private final int mAr;
  private final int mAs;
  boolean mAt;
  private int mAu;
  int mAv;
  int mAw;
  int mAx;
  public boolean mAy;
  public String mAz;
  ae mHandler;
  
  public j(Context paramContext, ViewGroup paramViewGroup, String paramString)
  {
    GMTrace.i(9712129015808L, 72361);
    this.mAi = 100;
    this.mAj = 1;
    this.mAk = 2;
    this.mAl = 3;
    this.mAm = 4;
    this.mAn = 5;
    this.mAo = 6;
    this.mAp = 7;
    this.mAq = 8;
    this.mAr = 9;
    this.mAs = 10;
    this.mAt = true;
    this.mAu = Color.parseColor("#44FEBB");
    this.mAv = Color.parseColor("#FFFFFF");
    this.mAw = Color.parseColor("#E54646");
    this.mAx = Color.parseColor("#FFC90C");
    this.mAe = false;
    this.mAy = false;
    this.mAz = "";
    this.mHandler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(9660589408256L, 71977);
        super.handleMessage(paramAnonymousMessage);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(9660589408256L, 71977);
          return;
          j.this.EN.setText(j.this.mAz);
          GMTrace.o(9660589408256L, 71977);
          return;
          w.d("MicroMsg.ShareHeaderMsgMgr", "update member num, isMyselfTalking=%b, isOtherTalking=%b", new Object[] { Boolean.valueOf(j.this.mAe), Boolean.valueOf(j.this.mAy) });
          if ((!j.this.mAe) && (!j.this.mAy))
          {
            Object localObject = j.this;
            ((j)localObject).EN.setTextColor(((j)localObject).mAv);
            ((j)localObject).EN.invalidate();
            int i = ((Integer)paramAnonymousMessage.obj).intValue();
            if (i == 0)
            {
              j.this.EN.setText(j.this.context.getString(R.l.eeA));
              GMTrace.o(9660589408256L, 71977);
              return;
            }
            j.this.EN.setText(j.this.context.getResources().getQuantityString(R.j.cID, i, new Object[] { Integer.valueOf(i) }));
            GMTrace.o(9660589408256L, 71977);
            return;
            if ((j.this.mAy) || (j.this.mAe))
            {
              removeMessages(3);
              localObject = Message.obtain();
              ((Message)localObject).what = 3;
              ((Message)localObject).obj = paramAnonymousMessage.obj;
              sendMessage((Message)localObject);
              GMTrace.o(9660589408256L, 71977);
              return;
            }
            j.this.mAz = j.this.EN.getText().toString();
            j.this.aKQ();
            paramAnonymousMessage = r.fs((String)paramAnonymousMessage.obj);
            j.this.EN.setText(j.this.context.getString(R.l.eeG, new Object[] { paramAnonymousMessage }));
            if ((j.this.mAe) || (j.this.mAy))
            {
              j.this.aKR();
              GMTrace.o(9660589408256L, 71977);
              return;
              if ((j.this.mAy) || (j.this.mAe))
              {
                removeMessages(4);
                localObject = Message.obtain();
                ((Message)localObject).what = 4;
                ((Message)localObject).obj = paramAnonymousMessage.obj;
                sendMessage((Message)localObject);
                GMTrace.o(9660589408256L, 71977);
                return;
              }
              j.this.mAz = j.this.EN.getText().toString();
              j.this.aKQ();
              paramAnonymousMessage = r.fs((String)paramAnonymousMessage.obj);
              j.this.EN.setText(j.this.context.getString(R.l.eeH, new Object[] { paramAnonymousMessage }));
              if ((j.this.mAe) || (j.this.mAy))
              {
                j.this.aKR();
                GMTrace.o(9660589408256L, 71977);
                return;
                j.this.mAy = true;
                j.this.mAe = false;
                j.this.aKQ();
                paramAnonymousMessage = r.fs((String)paramAnonymousMessage.obj);
                j.this.EN.setText(j.this.context.getString(R.l.eeI, new Object[] { paramAnonymousMessage }));
                GMTrace.o(9660589408256L, 71977);
                return;
                j.this.mAe = true;
                j.this.mAy = false;
                j.this.aKQ();
                j.this.EN.setText(j.this.context.getString(R.l.eeF));
                GMTrace.o(9660589408256L, 71977);
                return;
                j.this.mAe = false;
                if (!j.this.mAy)
                {
                  j.this.fF(true);
                  GMTrace.o(9660589408256L, 71977);
                  return;
                  j.this.mAy = true;
                  paramAnonymousMessage = j.this;
                  paramAnonymousMessage.EN.setTextColor(paramAnonymousMessage.mAw);
                  paramAnonymousMessage.EN.invalidate();
                  j.this.EN.setText(j.this.context.getString(R.l.eeJ));
                  j.this.mAz = j.this.EN.getText().toString();
                  j.this.aKR();
                  GMTrace.o(9660589408256L, 71977);
                  return;
                  paramAnonymousMessage = j.this;
                  paramAnonymousMessage.EN.setTextColor(paramAnonymousMessage.mAx);
                  paramAnonymousMessage.EN.invalidate();
                  j.this.EN.setText(j.this.context.getString(R.l.eeK));
                  GMTrace.o(9660589408256L, 71977);
                  return;
                  j.this.mAy = false;
                  j.this.fF(false);
                }
              }
            }
          }
        }
      }
    };
    this.context = paramContext;
    this.mAg = paramViewGroup;
    this.EN = ((TextView)this.mAg.findViewById(R.h.title));
    this.jQt = paramString;
    init();
    GMTrace.o(9712129015808L, 72361);
  }
  
  private void init()
  {
    GMTrace.i(9712263233536L, 72362);
    w.d("MicroMsg.ShareHeaderMsgMgr", "init");
    this.EN.invalidate();
    this.mAh = new ArrayList();
    Iterator localIterator = l.aKo().Bh(this.jQt).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.mAh.add(str);
    }
    fF(false);
    GMTrace.o(9712263233536L, 72362);
  }
  
  public final void aKQ()
  {
    GMTrace.i(16051500744704L, 119593);
    this.EN.setTextColor(this.mAu);
    this.EN.invalidate();
    GMTrace.o(16051500744704L, 119593);
  }
  
  public final void aKR()
  {
    GMTrace.i(16051634962432L, 119594);
    this.mHandler.removeMessages(1);
    Message localMessage = Message.obtain();
    localMessage.what = 1;
    this.mHandler.sendMessageDelayed(localMessage, 100L);
    GMTrace.o(16051634962432L, 119594);
  }
  
  public final void fF(boolean paramBoolean)
  {
    GMTrace.i(9712397451264L, 72363);
    this.mHandler.removeMessages(2);
    Message localMessage = Message.obtain();
    localMessage.what = 2;
    localMessage.obj = Integer.valueOf(this.mAh.size());
    w.d("MicroMsg.ShareHeaderMsgMgr", "updateMemberCount, size=%d, isDelay=%b", new Object[] { Integer.valueOf(this.mAh.size()), Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.mHandler.sendMessageDelayed(localMessage, 100L);
      GMTrace.o(9712397451264L, 72363);
      return;
    }
    this.mHandler.sendMessage(localMessage);
    GMTrace.o(9712397451264L, 72363);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */