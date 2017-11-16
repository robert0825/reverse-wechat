package com.tencent.mm.plugin.music.a.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.a;
import com.tencent.mm.plugin.music.a.h;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.sdk.b.c<t>
{
  public a()
  {
    GMTrace.i(19525189763072L, 145474);
    this.vhf = t.class.getName().hashCode();
    GMTrace.o(19525189763072L, 145474);
  }
  
  private static boolean a(t paramt)
  {
    GMTrace.i(20504844959744L, 152773);
    if (paramt.eAJ.action != 6) {
      w.i("MicroMsg.AudioActionListener", "audio action listener callback, action:%d", new Object[] { Integer.valueOf(paramt.eAJ.action) });
    }
    switch (paramt.eAJ.action)
    {
    }
    for (;;)
    {
      boolean bool = true;
      label322:
      Object localObject3;
      Object localObject4;
      for (;;)
      {
        if (paramt.eAJ.action != 6) {
          w.d("MicroMsg.AudioActionListener", "audio action listener callback, ret:%b", new Object[] { Boolean.valueOf(bool) });
        }
        GMTrace.o(20504844959744L, 152773);
        return bool;
        localObject1 = h.aSx().dc(paramt.eAJ.appId, paramt.eAJ.eAL);
        paramt.eAJ.eAL = ((String)localObject1);
        bool = true;
        continue;
        localObject1 = h.aSx();
        localObject2 = paramt.eAJ.eAN;
        if (localObject2 == null)
        {
          w.e("MicroMsg.AudioPlayerMgr", "startAudio, play param is null");
          b.ah(605, "");
          bool = false;
        }
        for (;;)
        {
          paramt.eAK.eAO = bool;
          break;
          if (TextUtils.isEmpty(((com.tencent.mm.ab.a)localObject2).eAL))
          {
            w.e("MicroMsg.AudioPlayerMgr", "startAudio fail, the audioId is empty!");
            b.ah(604, ((com.tencent.mm.ab.a)localObject2).eAL);
            bool = false;
          }
          else
          {
            if (((b)localObject1).nqk.contains(((com.tencent.mm.ab.a)localObject2).eAL)) {
              break label322;
            }
            w.e("MicroMsg.AudioPlayerMgr", "startAudio fail, the audioId is not found!");
            b.ah(601, ((com.tencent.mm.ab.a)localObject2).eAL);
            bool = false;
          }
        }
        w.i("MicroMsg.AudioPlayerMgr", "startAudio");
        localObject3 = ((b)localObject1).Dy(((com.tencent.mm.ab.a)localObject2).eAL);
        int i = ((b)localObject1).Dt((String)localObject3);
        if (i >= 10)
        {
          w.e("MicroMsg.AudioPlayerMgr", "startAudio now created QQAudioPlayer count %d arrive MAX_PLAY_AUDIO_PLAYER_COUNT, but save param!", new Object[] { Integer.valueOf(i) });
          ((b)localObject1).nqs.put(((com.tencent.mm.ab.a)localObject2).eAL, localObject2);
          w.i("MicroMsg.AudioPlayerMgr", "autoPlay:%b", new Object[] { Boolean.valueOf(((com.tencent.mm.ab.a)localObject2).grR) });
          if ((((com.tencent.mm.ab.a)localObject2).grR) && (((b)localObject1).aSE())) {
            ((b)localObject1).aSF();
          }
        }
        else
        {
          ((b)localObject1).Dz(((com.tencent.mm.ab.a)localObject2).eAL);
          localObject4 = ((b)localObject1).Du(((com.tencent.mm.ab.a)localObject2).eAL);
          if (localObject4 != null) {
            break label623;
          }
          w.e("MicroMsg.AudioPlayerMgr", "startAudio, player is null, create new QQAudioPlayer with audioId:%s", new Object[] { ((com.tencent.mm.ab.a)localObject2).eAL });
          localObject4 = new e();
          ((e)localObject4).a(((b)localObject1).nqz);
          ((e)localObject4).DD(((com.tencent.mm.ab.a)localObject2).eAL);
          if (!((com.tencent.mm.ab.a)localObject2).grR) {
            break label597;
          }
          ((b)localObject1).e(((com.tencent.mm.ab.a)localObject2).eAL, (e)localObject4);
          ((com.tencent.mm.ab.a)localObject2).grT = System.currentTimeMillis();
          ((e)localObject4).a((com.tencent.mm.ab.a)localObject2);
        }
        for (;;)
        {
          ((b)localObject1).nqq.put(localObject3, ((com.tencent.mm.ab.a)localObject2).processName);
          ((b)localObject1).nqs.put(((com.tencent.mm.ab.a)localObject2).eAL, localObject2);
          bool = true;
          break;
          if (((com.tencent.mm.ab.a)localObject2).grR)
          {
            b.ah(600, ((com.tencent.mm.ab.a)localObject2).eAL);
            bool = false;
            break;
          }
          bool = true;
          break;
          label597:
          ((b)localObject1).f(((com.tencent.mm.ab.a)localObject2).eAL, (e)localObject4);
          ((e)localObject4).aSM();
          w.e("MicroMsg.AudioPlayerMgr", "autoplay false, not to play ");
          continue;
          label623:
          w.i("MicroMsg.AudioPlayerMgr", "startAudio, audioId:%s", new Object[] { ((com.tencent.mm.ab.a)localObject2).eAL });
          if (((com.tencent.mm.ab.a)localObject2).grR)
          {
            ((b)localObject1).e(((com.tencent.mm.ab.a)localObject2).eAL, (e)localObject4);
            ((com.tencent.mm.ab.a)localObject2).grT = System.currentTimeMillis();
            ((e)localObject4).a((com.tencent.mm.ab.a)localObject2);
          }
          else
          {
            ((b)localObject1).f(((com.tencent.mm.ab.a)localObject2).eAL, (e)localObject4);
            ((e)localObject4).aSM();
            w.e("MicroMsg.AudioPlayerMgr", "autoplay false, not to play ");
          }
        }
        localObject2 = h.aSx();
        localObject3 = paramt.eAJ.eAL;
        if (!((b)localObject2).nqk.contains(localObject3))
        {
          w.e("MicroMsg.AudioPlayerMgr", "resumeAudio fail, the audioId is not found!");
          b.ah(601, (String)localObject3);
          bool = false;
        }
        for (;;)
        {
          paramt.eAK.eAO = bool;
          break;
          if (((b)localObject2).nqs.get(localObject3) == null)
          {
            w.e("MicroMsg.AudioPlayerMgr", "resumeAudio fail, the param is not found!");
            b.ah(602, (String)localObject3);
            bool = false;
          }
          else
          {
            w.i("MicroMsg.AudioPlayerMgr", "resumeAudio, audioId:%s", new Object[] { localObject3 });
            i = ((b)localObject2).Dt(((b)localObject2).Dy((String)localObject3));
            if (i >= 10)
            {
              w.e("MicroMsg.AudioPlayerMgr", "now created QQAudioPlayer count %d arrive MAX_PLAY_AUDIO_PLAYER_COUNT", new Object[] { Integer.valueOf(i) });
              if (((b)localObject2).aSE()) {
                ((b)localObject2).aSF();
              }
            }
            else
            {
              localObject1 = ((b)localObject2).Du((String)localObject3);
              if (localObject1 != null) {
                break label994;
              }
              w.e("MicroMsg.AudioPlayerMgr", "resumeAudio, player is null");
              ((b)localObject2).Dz((String)localObject3);
              w.i("MicroMsg.AudioPlayerMgr", "create new QQAudioPlayer with audioId %s to play", new Object[] { localObject3 });
              localObject1 = new e();
              ((e)localObject1).a(((b)localObject2).nqz);
              ((e)localObject1).DD((String)localObject3);
              ((b)localObject2).e((String)localObject3, (e)localObject1);
              localObject2 = (com.tencent.mm.ab.a)((b)localObject2).nqs.get(localObject3);
              ((com.tencent.mm.ab.a)localObject2).grR = true;
              ((com.tencent.mm.ab.a)localObject2).grQ = 0;
              ((com.tencent.mm.ab.a)localObject2).grT = System.currentTimeMillis();
              ((e)localObject1).a((com.tencent.mm.ab.a)localObject2);
            }
            for (;;)
            {
              bool = true;
              break;
              b.ah(600, (String)localObject3);
              bool = false;
              break;
              label994:
              ((b)localObject2).e((String)localObject3, (e)localObject1);
              if ((((e)localObject1).JR()) && (!((e)localObject1).JQ()))
              {
                w.i("MicroMsg.AudioPlayerMgr", "is pause, do resume");
                ((e)localObject1).resume();
              }
              else if (((e)localObject1).isPrepared())
              {
                localObject2 = (com.tencent.mm.ab.a)((b)localObject2).nqs.get(localObject3);
                ((com.tencent.mm.ab.a)localObject2).grR = true;
                ((com.tencent.mm.ab.a)localObject2).grT = System.currentTimeMillis();
                w.i("MicroMsg.AudioPlayerMgr", "is prepared, do resume");
                ((e)localObject1).resume();
                ((com.tencent.mm.ab.a)localObject2).grQ = 0;
              }
              else
              {
                if (((e)localObject1).JR()) {
                  break label1147;
                }
                localObject2 = (com.tencent.mm.ab.a)((b)localObject2).nqs.get(localObject3);
                ((com.tencent.mm.ab.a)localObject2).grR = true;
                ((com.tencent.mm.ab.a)localObject2).grT = System.currentTimeMillis();
                w.i("MicroMsg.AudioPlayerMgr", "is stop, do startPlay");
                ((e)localObject1).a((com.tencent.mm.ab.a)localObject2);
                ((com.tencent.mm.ab.a)localObject2).grQ = 0;
              }
            }
            label1147:
            w.e("MicroMsg.AudioPlayerMgr", "do nothing");
            bool = false;
          }
        }
        localObject1 = h.aSx();
        localObject2 = paramt.eAJ.eAL;
        localObject3 = ((b)localObject1).Du((String)localObject2);
        if (localObject3 == null) {
          w.e("MicroMsg.AudioPlayerMgr", "pauseAudio, player is null");
        }
        for (bool = false;; bool = true)
        {
          paramt.eAK.eAO = bool;
          break;
          w.i("MicroMsg.AudioPlayerMgr", "pauseAudio, audioId:%s", new Object[] { localObject2 });
          ((e)localObject3).pause();
          ((b)localObject1).b((String)localObject2, (e)localObject3);
          ((b)localObject1).f((String)localObject2, (e)localObject3);
        }
        bool = h.aSx().Dq(paramt.eAJ.eAL);
        paramt.eAK.eAO = bool;
        continue;
        localObject1 = h.aSx();
        localObject2 = paramt.eAJ.eAL;
        localObject3 = ((b)localObject1).Du((String)localObject2);
        if (localObject3 == null) {
          w.e("MicroMsg.AudioPlayerMgr", "stopPlayOnBackGround, player is null");
        }
        for (bool = false;; bool = true)
        {
          paramt.eAK.eAO = bool;
          break;
          w.i("MicroMsg.AudioPlayerMgr", "stopPlayOnBackGround, audioId:%s", new Object[] { localObject2 });
          ((e)localObject3).grW = false;
          ((e)localObject3).aSQ();
          localObject4 = (com.tencent.mm.ab.a)((b)localObject1).nqs.get(localObject2);
          if (localObject4 != null)
          {
            ((com.tencent.mm.ab.a)localObject4).grQ = 0;
            ((com.tencent.mm.ab.a)localObject4).grR = true;
          }
          ((b)localObject1).b((String)localObject2, (e)localObject3);
          ((b)localObject1).f((String)localObject2, (e)localObject3);
        }
        bool = h.aSx().Dr(paramt.eAJ.eAL);
        paramt.eAK.eAO = bool;
        continue;
        localObject2 = h.aSx();
        localObject1 = paramt.eAJ.eAL;
        i = paramt.eAJ.eAM;
        localObject2 = ((b)localObject2).Du((String)localObject1);
        if (localObject2 == null) {
          w.e("MicroMsg.AudioPlayerMgr", "seekToAudio, player is null");
        }
        for (bool = false;; bool = ((e)localObject2).gG(i))
        {
          paramt.eAK.eAO = bool;
          break;
          w.i("MicroMsg.AudioPlayerMgr", "seekToAudio, audioId:%s, time:%s", new Object[] { localObject1, Integer.valueOf(i) });
        }
        localObject1 = h.aSx().Du(paramt.eAJ.eAL);
        if (localObject1 == null) {
          w.e("MicroMsg.AudioPlayerMgr", "isStartPlayAudio, player is null");
        }
        for (bool = false;; bool = ((e)localObject1).JR())
        {
          paramt.eAK.eAO = bool;
          break;
        }
        localObject1 = h.aSx().Du(paramt.eAJ.eAL);
        if (localObject1 == null) {
          w.e("MicroMsg.AudioPlayerMgr", "isPlayingAudio, player is null");
        }
        for (bool = false;; bool = ((e)localObject1).JQ())
        {
          paramt.eAK.eAO = bool;
          break;
        }
        localObject1 = h.aSx();
        localObject2 = paramt.eAJ.eAL;
        localObject3 = ((b)localObject1).Du((String)localObject2);
        if (localObject3 == null)
        {
          w.e("MicroMsg.AudioPlayerMgr", "isPauseOnBackground, player is null");
          localObject1 = ((b)localObject1).Ds((String)localObject2);
          if (localObject1 != null) {
            bool = ((com.tencent.mm.ab.c)localObject1).grW;
          }
        }
        for (;;)
        {
          paramt.eAK.eAO = bool;
          break;
          bool = false;
          continue;
          bool = ((e)localObject3).grW;
        }
        localObject1 = h.aSx().Ds(paramt.eAJ.eAL);
        paramt.eAK.eAP = ((com.tencent.mm.ab.c)localObject1);
        bool = true;
        continue;
        i = h.aSx().Dt(paramt.eAJ.appId);
        paramt.eAK.count = i;
        bool = true;
        continue;
        h.aSx().Dv(paramt.eAJ.appId);
        bool = true;
        continue;
        h.aSx().Dw(paramt.eAJ.appId);
        bool = true;
      }
      Object localObject1 = h.aSx();
      Object localObject2 = paramt.eAJ.processName;
      if (((b)localObject1).nqp.size() != 0)
      {
        w.i("MicroMsg.AudioPlayerMgr", "destroyAllAudioPlayersByProcessName with name :%s", new Object[] { localObject2 });
        localObject3 = new ArrayList();
        ((ArrayList)localObject3).addAll(((b)localObject1).nqp);
        localObject3 = ((ArrayList)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (String)((Iterator)localObject3).next();
          String str = (String)((b)localObject1).nqq.get(localObject4);
          if ((localObject2 != null) && (((String)localObject2).equalsIgnoreCase(str)))
          {
            w.i("MicroMsg.AudioPlayerMgr", "The app brand process name is same as the process which is killed by system");
            ((b)localObject1).Dw((String)localObject4);
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */