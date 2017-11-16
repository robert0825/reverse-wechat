package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.ca;
import com.tencent.mm.g.a.ca.a;
import com.tencent.mm.g.a.ca.b;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.md;
import com.tencent.mm.g.a.md.b;
import com.tencent.mm.g.a.qg;
import com.tencent.mm.g.a.qg.b;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;

public class FavUrlTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<FavUrlTask> CREATOR;
  public int actionType;
  public boolean eAO;
  public boolean lIk;
  public boolean lIl;
  public Bundle ler;
  public int ret;
  public int type;
  
  static
  {
    GMTrace.i(17075582009344L, 127223);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(17075582009344L, 127223);
  }
  
  public FavUrlTask()
  {
    GMTrace.i(17075313573888L, 127221);
    GMTrace.o(17075313573888L, 127221);
  }
  
  public FavUrlTask(Parcel paramParcel)
  {
    GMTrace.i(17075447791616L, 127222);
    f(paramParcel);
    GMTrace.o(17075447791616L, 127222);
  }
  
  public final void RY()
  {
    GMTrace.i(17074910920704L, 127218);
    switch (this.actionType)
    {
    }
    for (;;)
    {
      GMTrace.o(17074910920704L, 127218);
      return;
      Object localObject2;
      int i;
      Object localObject3;
      boolean bool;
      if (this.ler != null)
      {
        long l = this.ler.getLong("msg_id", Long.MIN_VALUE);
        localObject2 = this.ler.getString("sns_local_id");
        i = this.ler.getInt("news_svr_id", 0);
        localObject3 = this.ler.getString("news_svr_tweetid");
        localObject1 = new cf();
        if (Long.MIN_VALUE == l) {
          break label367;
        }
        ((cf)localObject1).eDv.eDz = this.ler.getInt("message_index", 0);
        bool = e.a((cf)localObject1, l);
        if (!bool) {
          break label530;
        }
        Object localObject4 = bg.nl(this.ler.getString("prePublishId"));
        localObject2 = u.gy((String)localObject4);
        localObject3 = u.Av().p((String)localObject2, true);
        ((u.b)localObject3).o("sendAppMsgScene", Integer.valueOf(2));
        ((u.b)localObject3).o("preChatName", this.ler.getString("preChatName"));
        ((u.b)localObject3).o("preMsgIndex", Integer.valueOf(this.ler.getInt("preMsgIndex")));
        ((u.b)localObject3).o("prePublishId", localObject4);
        ((u.b)localObject3).o("preUsername", this.ler.getString("preUsername"));
        ((u.b)localObject3).o("getA8KeyScene", this.ler.getString("getA8KeyScene"));
        ((u.b)localObject3).o("referUrl", this.ler.getString("referUrl"));
        localObject4 = this.ler.getBundle("jsapiargs");
        if (localObject4 != null) {
          ((u.b)localObject3).o("adExtStr", ((Bundle)localObject4).getString("key_snsad_statextstr"));
        }
        ((cf)localObject1).eDv.eDA = ((String)localObject2);
        a.vgX.m((b)localObject1);
      }
      for (;;)
      {
        this.ret = ((cf)localObject1).eDw.ret;
        GMTrace.o(17074910920704L, 127218);
        return;
        label367:
        if (!bg.nm((String)localObject2))
        {
          localObject3 = new qg();
          ((qg)localObject3).eUS.eUV = ((String)localObject2);
          ((qg)localObject3).eUS.eUW = ((cf)localObject1);
          ((qg)localObject3).eUS.url = this.ler.getString("rawUrl");
          a.vgX.m((b)localObject3);
          bool = ((qg)localObject3).eUT.eDb;
          break;
        }
        if (i != 0)
        {
          localObject2 = new md();
          ((md)localObject2).eQW.opType = 3;
          ((md)localObject2).eQW.eQY = ((cf)localObject1);
          ((md)localObject2).eQW.eQZ = i;
          ((md)localObject2).eQW.eRa = ((String)localObject3);
          a.vgX.m((b)localObject2);
          bool = ((md)localObject2).eQX.eDb;
          break;
        }
        this.lIk = true;
        GMTrace.o(17074910920704L, 127218);
        return;
        label530:
        if (((cf)localObject1).eDv.eDB == 0) {
          ((cf)localObject1).eDv.eDB = R.l.dtC;
        }
        a.vgX.m((b)localObject1);
      }
      Object localObject1 = new ft();
      ((ft)localObject1).eIo.type = 35;
      a.vgX.m((b)localObject1);
      GMTrace.o(17074910920704L, 127218);
      return;
      this.lIl = d.LL("favorite");
      GMTrace.o(17074910920704L, 127218);
      return;
      localObject1 = new ca();
      ((ca)localObject1).eDn.eDp = this.ler.getLong("fav_local_id", -1L);
      a.vgX.m((b)localObject1);
      w.i("MicroMsg.FavUrlTask", "do del fav web url, local id %d, result %B", new Object[] { Long.valueOf(((ca)localObject1).eDn.eDp), Boolean.valueOf(((ca)localObject1).eDo.eDb) });
      this.eAO = ((ca)localObject1).eDo.eDb;
    }
  }
  
  public final void f(Parcel paramParcel)
  {
    boolean bool2 = true;
    GMTrace.i(17075045138432L, 127219);
    this.actionType = paramParcel.readInt();
    this.ler = paramParcel.readBundle();
    if (paramParcel.readByte() == 1)
    {
      bool1 = true;
      this.lIk = bool1;
      if (paramParcel.readByte() != 1) {
        break label103;
      }
      bool1 = true;
      label52:
      this.eAO = bool1;
      this.ret = paramParcel.readInt();
      this.type = paramParcel.readInt();
      if (paramParcel.readByte() != 1) {
        break label108;
      }
    }
    label103:
    label108:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.lIl = bool1;
      GMTrace.o(17075045138432L, 127219);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label52;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(17075179356160L, 127220);
    paramParcel.writeInt(this.actionType);
    paramParcel.writeBundle(this.ler);
    if (this.lIk)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      if (!this.eAO) {
        break label103;
      }
      paramInt = 1;
      label51:
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.ret);
      paramParcel.writeInt(this.type);
      if (!this.lIl) {
        break label108;
      }
    }
    label103:
    label108:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      GMTrace.o(17075179356160L, 127220);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label51;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\model\FavUrlTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */