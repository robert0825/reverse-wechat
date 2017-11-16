package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.p;
import com.tencent.mm.plugin.location.ui.impl.TrackPoint;
import com.tencent.mm.plugin.p.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMHorList;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i
  implements h.c, k.a
{
  private Context context;
  private String jPg;
  private h mAa;
  private j mAb;
  private ArrayList<String> mAc;
  private String mAd;
  private boolean mAe;
  public a mAf;
  private ViewGroup mzY;
  private View mzZ;
  private d mzz;
  
  public i(Context paramContext, ViewGroup paramViewGroup, View paramView, String paramString, d paramd)
  {
    GMTrace.i(9721658474496L, 72432);
    this.mAd = "";
    this.jPg = "";
    this.mAe = false;
    this.mzY = paramViewGroup;
    this.mzZ = paramView;
    this.context = paramContext;
    this.mAc = new ArrayList();
    this.jPg = paramString;
    this.mzz = paramd;
    init();
    GMTrace.o(9721658474496L, 72432);
  }
  
  private void init()
  {
    GMTrace.i(9721792692224L, 72433);
    w.d("MicroMsg.ShareHeaderMgr", "init ShareHeaderMgr, roomname=%s", new Object[] { this.jPg });
    this.mAa = new h(this.context, this.mzZ, this.jPg);
    this.mAa.mzP = this;
    this.mAb = new j(this.context, this.mzY, this.jPg);
    Iterator localIterator = l.aKo().Bh(this.jPg).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.mAc.add(str);
    }
    GMTrace.o(9721792692224L, 72433);
  }
  
  public final void Bq(String paramString)
  {
    GMTrace.i(9722061127680L, 72435);
    if (this.mAf != null) {
      this.mAf.Bq(paramString);
    }
    GMTrace.o(9722061127680L, 72435);
  }
  
  public final void Br(String paramString)
  {
    GMTrace.i(9722329563136L, 72437);
    w.d("MicroMsg.ShareHeaderMgr", "onCurTalkerChange, username = %s", new Object[] { paramString });
    if (this.mAe)
    {
      GMTrace.o(9722329563136L, 72437);
      return;
    }
    this.mAd = paramString;
    paramString = this.mAa;
    Object localObject = this.mAd;
    w.i("MicroMsg.ShareHeaderAvatarViewMgr", "onCurMemberChange, username=%s", new Object[] { localObject });
    if (bg.nm((String)localObject))
    {
      paramString.aKJ();
      paramString = this.mAb;
      localObject = this.mAd;
      w.d("MicroMsg.ShareHeaderMsgMgr", "onCurMemberChange, curMember=%s", new Object[] { localObject });
      if (bg.nm((String)localObject)) {
        break label218;
      }
      if (!bg.nm(r.fs((String)localObject)))
      {
        paramString.mAy = true;
        paramString.mHandler.removeMessages(5);
        Message localMessage = Message.obtain();
        localMessage.what = 5;
        localMessage.obj = localObject;
        paramString.mHandler.sendMessageAtFrontOfQueue(localMessage);
      }
      paramString.fF(true);
    }
    for (;;)
    {
      paramString = this.mzz.getViewByItag(this.mAd);
      if ((paramString instanceof TrackPoint))
      {
        paramString.bringToFront();
        this.mzz.invalidate();
      }
      GMTrace.o(9722329563136L, 72437);
      return;
      paramString.aKJ();
      paramString.Bn((String)localObject);
      break;
      label218:
      paramString.mAy = false;
      paramString.mHandler.removeMessages(10);
      localObject = Message.obtain();
      ((Message)localObject).what = 10;
      paramString.mHandler.sendMessage((Message)localObject);
      paramString.fF(true);
    }
  }
  
  public final void Bs(String paramString)
  {
    GMTrace.i(9722732216320L, 72440);
    j localj = this.mAb;
    w.d("MicroMsg.ShareHeaderMsgMgr", "onTalkConflict, username=%s", new Object[] { paramString });
    if ((!bg.nm(paramString)) && (!bg.nm(r.fs(paramString))))
    {
      localj.mAy = true;
      localj.mHandler.removeMessages(7);
      paramString = Message.obtain();
      paramString.what = 7;
      localj.mHandler.sendMessageAtFrontOfQueue(paramString);
    }
    GMTrace.o(9722732216320L, 72440);
  }
  
  public final void I(ArrayList<String> paramArrayList)
  {
    GMTrace.i(9721926909952L, 72434);
    w.d("MicroMsg.ShareHeaderMgr", "onRefreshMemberList, members.size=%d", new Object[] { Integer.valueOf(paramArrayList.size()) });
    this.mAa.I(paramArrayList);
    j localj = this.mAb;
    w.d("MicroMsg.ShareHeaderMsgMgr", "onRefreshMemberList, size=%d", new Object[] { Integer.valueOf(paramArrayList.size()) });
    Object localObject2 = new ArrayList();
    Object localObject1 = new ArrayList();
    Iterator localIterator = paramArrayList.iterator();
    String str;
    while (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (localj.mAh.indexOf(str) == -1) {
        ((ArrayList)localObject2).add(str);
      }
    }
    localIterator = localj.mAh.iterator();
    while (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (paramArrayList.indexOf(str) == -1) {
        ((ArrayList)localObject1).add(str);
      }
    }
    if (localj.mAt)
    {
      localj.mAt = false;
      if (((ArrayList)localObject2).size() > 0)
      {
        paramArrayList = ((ArrayList)localObject2).iterator();
        while (paramArrayList.hasNext())
        {
          localObject1 = (String)paramArrayList.next();
          localj.mAh.add(localObject1);
        }
      }
      localj.fF(false);
      GMTrace.o(9721926909952L, 72434);
      return;
    }
    if (((ArrayList)localObject2).size() > 0)
    {
      paramArrayList = (String)((ArrayList)localObject2).get(0);
      localj.mAh.add(paramArrayList);
      if (!bg.nm(r.fs(paramArrayList)))
      {
        localj.mHandler.removeMessages(3);
        localObject2 = Message.obtain();
        ((Message)localObject2).what = 3;
        ((Message)localObject2).obj = paramArrayList;
        localj.mHandler.sendMessage((Message)localObject2);
        localj.fF(true);
      }
    }
    if (((ArrayList)localObject1).size() > 0)
    {
      paramArrayList = (String)((ArrayList)localObject1).get(0);
      if ((!bg.nm(paramArrayList)) && (localj.mAh.indexOf(paramArrayList) != -1))
      {
        localj.mAh.remove(localj.mAh.indexOf(paramArrayList));
        if (!bg.nm(r.fs(paramArrayList)))
        {
          localObject1 = Message.obtain();
          ((Message)localObject1).what = 4;
          ((Message)localObject1).obj = paramArrayList;
          localj.mHandler.sendMessage((Message)localObject1);
          localj.fF(true);
        }
      }
    }
    GMTrace.o(9721926909952L, 72434);
  }
  
  public final void aKN()
  {
    GMTrace.i(9722195345408L, 72436);
    w.d("MicroMsg.ShareHeaderMgr", "onMyselfTalking");
    this.mAe = true;
    String str = q.zE();
    this.mAa.aKJ();
    this.mAa.Bn(str);
    Object localObject = this.mAb;
    w.d("MicroMsg.ShareHeaderMsgMgr", "onMyselfTalking");
    ((j)localObject).mHandler.removeMessages(6);
    ((j)localObject).mHandler.removeMessages(5);
    Message localMessage = Message.obtain();
    localMessage.what = 6;
    ((j)localObject).mHandler.sendMessageAtFrontOfQueue(localMessage);
    localObject = this.mzz.getViewByItag(str);
    if ((localObject instanceof TrackPoint))
    {
      ((View)localObject).bringToFront();
      this.mzz.invalidate();
    }
    this.mAd = str;
    GMTrace.o(9722195345408L, 72436);
  }
  
  public final void aKO()
  {
    GMTrace.i(9722463780864L, 72438);
    w.i("MicroMsg.ShareHeaderMgr", "onMyselfFinishTalking");
    Object localObject1 = this.mAa;
    Object localObject2 = q.zE();
    w.d("MicroMsg.ShareHeaderAvatarViewMgr", "onMemberFinishTalking, username=%s", new Object[] { localObject2 });
    if (((h)localObject1).mzO.Bp((String)localObject2))
    {
      ((h)localObject1).mzO.Bo((String)localObject2).aKM();
      ((h)localObject1).mzO.notifyDataSetChanged();
      ((h)localObject1).mzN.invalidate();
    }
    localObject1 = this.mAb;
    w.d("MicroMsg.ShareHeaderMsgMgr", "onMyselfFinishTalking");
    ((j)localObject1).mHandler.removeMessages(9);
    ((j)localObject1).mHandler.removeMessages(10);
    localObject2 = Message.obtain();
    ((Message)localObject2).what = 9;
    ((j)localObject1).mHandler.sendMessage((Message)localObject2);
    this.mAd = "";
    this.mAe = false;
    GMTrace.o(9722463780864L, 72438);
  }
  
  public final void aKP()
  {
    GMTrace.i(9722597998592L, 72439);
    j localj = this.mAb;
    w.d("MicroMsg.ShareHeaderMsgMgr", "onPrepareTalking");
    localj.mHandler.removeMessages(8);
    Message localMessage = Message.obtain();
    localMessage.what = 8;
    localj.mHandler.sendMessageAtFrontOfQueue(localMessage);
    GMTrace.o(9722597998592L, 72439);
  }
  
  public static abstract interface a
  {
    public abstract void Bq(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */