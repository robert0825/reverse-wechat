package com.tencent.mm.plugin.music.a.a;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.u;
import com.tencent.mm.plugin.music.a.f.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
{
  public Object kxB;
  private Runnable nqA;
  public Runnable nqB;
  LinkedList<String> nqk;
  private HashMap<String, e> nql;
  private LinkedList<String> nqm;
  private HashMap<String, e> nqn;
  private LinkedList<String> nqo;
  public LinkedList<String> nqp;
  HashMap<String, String> nqq;
  private HashMap<String, LinkedList<String>> nqr;
  HashMap<String, com.tencent.mm.ab.a> nqs;
  private HashMap<String, com.tencent.mm.ab.c> nqt;
  private String nqu;
  public boolean nqv;
  private boolean nqw;
  public long nqx;
  private long nqy;
  a nqz;
  
  public b()
  {
    GMTrace.i(19522908061696L, 145457);
    this.nqk = new LinkedList();
    this.nql = new HashMap();
    this.nqm = new LinkedList();
    this.nqn = new HashMap();
    this.nqo = new LinkedList();
    this.nqp = new LinkedList();
    this.nqq = new HashMap();
    this.nqr = new HashMap();
    this.nqs = new HashMap();
    this.nqt = new HashMap();
    this.nqu = "";
    this.kxB = new Object();
    this.nqv = false;
    this.nqw = false;
    this.nqx = 0L;
    this.nqy = 0L;
    this.nqz = new a()
    {
      public final void DB(String paramAnonymousString)
      {
        GMTrace.i(20501355298816L, 152747);
        e locale = b.this.Du(paramAnonymousString);
        if (locale == null)
        {
          w.e("MicroMsg.AudioPlayerMgr", "onPause player is null");
          GMTrace.o(20501355298816L, 152747);
          return;
        }
        b.this.b(paramAnonymousString, locale);
        b.this.f(paramAnonymousString, locale);
        b.this.aSz();
        b.this.aSA();
        GMTrace.o(20501355298816L, 152747);
      }
      
      public final void DC(String paramAnonymousString)
      {
        GMTrace.i(20501623734272L, 152749);
        e locale = b.this.Du(paramAnonymousString);
        if (locale == null)
        {
          w.e("MicroMsg.AudioPlayerMgr", "onComplete player is null");
          GMTrace.o(20501623734272L, 152749);
          return;
        }
        b.this.b(paramAnonymousString, locale);
        b.this.f(paramAnonymousString, locale);
        b.this.aSz();
        b.this.aSA();
        GMTrace.o(20501623734272L, 152749);
      }
      
      public final void onError(String paramAnonymousString)
      {
        GMTrace.i(20501757952000L, 152750);
        e locale = b.this.Du(paramAnonymousString);
        if (locale == null)
        {
          w.e("MicroMsg.AudioPlayerMgr", "onError player is null");
          GMTrace.o(20501757952000L, 152750);
          return;
        }
        b.this.b(paramAnonymousString, locale);
        b.this.f(paramAnonymousString, locale);
        b.this.aSz();
        b.this.aSA();
        GMTrace.o(20501757952000L, 152750);
      }
      
      public final void onStart(String arg1)
      {
        GMTrace.i(20501221081088L, 152746);
        e locale = b.this.Du(???);
        if (locale == null)
        {
          w.e("MicroMsg.AudioPlayerMgr", "onStart player is null");
          GMTrace.o(20501221081088L, 152746);
          return;
        }
        b.this.e(???, locale);
        synchronized (b.this.kxB)
        {
          b.this.nqv = false;
          af.F(b.this.nqB);
          GMTrace.o(20501221081088L, 152746);
          return;
        }
      }
      
      public final void xB(String paramAnonymousString)
      {
        GMTrace.i(20501489516544L, 152748);
        e locale = b.this.Du(paramAnonymousString);
        if (locale == null)
        {
          w.e("MicroMsg.AudioPlayerMgr", "onStop player is null");
          GMTrace.o(20501489516544L, 152748);
          return;
        }
        b.this.b(paramAnonymousString, locale);
        b.this.f(paramAnonymousString, locale);
        b.this.aSz();
        b.this.aSA();
        GMTrace.o(20501489516544L, 152748);
      }
    };
    this.nqA = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20502026387456L, 152752);
        w.i("MicroMsg.AudioPlayerMgr", "stopAudioDelayRunnable, run");
        Iterator localIterator = b.this.nqp.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (b.this.Dt(str) == 0) {
            b.this.Dv(str);
          }
        }
        GMTrace.o(20502026387456L, 152752);
      }
    };
    this.nqB = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20505113395200L, 152775);
        w.i("MicroMsg.AudioPlayerMgr", "releaseAudioDelayRunnable, run");
        ??? = b.this.nqp.iterator();
        int i = 0;
        if (((Iterator)???).hasNext())
        {
          String str = (String)((Iterator)???).next();
          if (b.this.Dt(str) != 0) {
            break label132;
          }
          b.this.Dx(str);
          i = 1;
        }
        label132:
        for (;;)
        {
          break;
          if (i == 0) {}
          synchronized (b.this.kxB)
          {
            b.this.nqv = true;
            b.this.nqx = System.currentTimeMillis();
            af.i(b.this.nqB, 1800000L);
            GMTrace.o(20505113395200L, 152775);
            return;
          }
        }
      }
    };
    aSy();
    GMTrace.o(19522908061696L, 145457);
  }
  
  private void DA(String paramString)
  {
    GMTrace.i(20504442306560L, 152770);
    w.i("MicroMsg.AudioPlayerMgr", "recycleStoppedPlayerByAppId");
    Dx(paramString);
    GMTrace.o(20504442306560L, 152770);
  }
  
  private void a(String paramString, e parame)
  {
    GMTrace.i(20502831693824L, 152758);
    w.i("MicroMsg.AudioPlayerMgr", "pausePlayerOnBackground, pause player on background by audioId:%s", new Object[] { paramString });
    com.tencent.mm.ab.a locala = (com.tencent.mm.ab.a)this.nqs.get(paramString);
    if ((locala != null) && (parame.JQ()) && (parame.JR()))
    {
      locala.grR = true;
      locala.grQ = parame.aSX();
    }
    for (;;)
    {
      b(paramString, parame);
      paramString = Ds(paramString);
      if ((paramString != null) && (parame.JQ())) {
        paramString.grV = true;
      }
      if ((parame.JQ()) || (parame.JR()) || (parame.aSV()) || (parame.isPrepared()) || (parame.isPaused()))
      {
        w.i("MicroMsg.QQAudioPlayer", "pauseOnBackGround");
        parame.grW = true;
        parame.aSW();
      }
      GMTrace.o(20502831693824L, 152758);
      return;
      if ((locala != null) && (parame.JR()))
      {
        locala.grR = true;
        locala.grQ = parame.aSX();
      }
      else if (locala != null)
      {
        locala.grR = true;
        locala.grQ = 0;
      }
    }
  }
  
  private int aSB()
  {
    GMTrace.i(20503905435648L, 152766);
    int i;
    boolean bool;
    synchronized (this.kxB)
    {
      Iterator localIterator = this.nqo.iterator();
      i = 0;
      if (localIterator.hasNext())
      {
        Object localObject3 = (String)localIterator.next();
        e locale = Du((String)localObject3);
        if (locale == null)
        {
          w.e("MicroMsg.AudioPlayerMgr", "isPausedPlayer, player is null");
          localObject3 = Ds((String)localObject3);
          if (localObject3 == null) {
            break label132;
          }
          bool = ((com.tencent.mm.ab.c)localObject3).grV;
        }
        else
        {
          bool = locale.isPaused();
        }
      }
      else
      {
        GMTrace.o(20503905435648L, 152766);
        return i;
      }
    }
    label132:
    label135:
    for (;;)
    {
      for (;;)
      {
        if (!bool) {
          break label135;
        }
        i += 1;
        break;
        bool = false;
      }
    }
  }
  
  private void aSC()
  {
    GMTrace.i(20504173871104L, 152768);
    w.i("MicroMsg.AudioPlayerMgr", "recyclePausedPlayer");
    synchronized (this.kxB)
    {
      Object localObject2 = new LinkedList();
      ((LinkedList)localObject2).addAll(this.nqo);
      localObject2 = ((LinkedList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Iterator)localObject2).next();
        e locale = (e)this.nqn.get(str);
        if ((locale != null) && (locale.isPaused())) {
          a(str, locale);
        }
      }
    }
    GMTrace.o(20504173871104L, 152768);
  }
  
  private void aSD()
  {
    GMTrace.i(20504308088832L, 152769);
    w.i("MicroMsg.AudioPlayerMgr", "recycleStopPlayer");
    for (;;)
    {
      String str;
      e locale;
      synchronized (this.kxB)
      {
        Object localObject2 = new LinkedList();
        ((LinkedList)localObject2).addAll(this.nqo);
        localObject2 = ((LinkedList)localObject2).iterator();
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        str = (String)((Iterator)localObject2).next();
        locale = (e)this.nqn.remove(str);
        this.nqo.remove(str);
        if (locale == null) {
          continue;
        }
        if (locale.grW)
        {
          b(str, locale);
          d(str, locale);
        }
      }
      if (!locale.isPaused())
      {
        b(str, locale);
        c(str, locale);
      }
    }
    GMTrace.o(20504308088832L, 152769);
  }
  
  public static void ah(int paramInt, String paramString)
  {
    GMTrace.i(19523713368064L, 145463);
    w.e("MicroMsg.AudioPlayerMgr", "onErrorEvent with errCode:%d, audioId:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    u localu = new u();
    localu.eAQ.action = 4;
    localu.eAQ.state = "error";
    localu.eAQ.errCode = h.rC(paramInt);
    localu.eAQ.eAR = h.rD(paramInt);
    localu.eAQ.eAL = paramString;
    com.tencent.mm.sdk.b.a.vgX.a(localu, Looper.getMainLooper());
    GMTrace.o(19523713368064L, 145463);
  }
  
  private static void c(String paramString, e parame)
  {
    GMTrace.i(20503100129280L, 152760);
    if (parame == null)
    {
      w.e("MicroMsg.AudioPlayerMgr", "destroyPlayer player is null for audioId:%s", new Object[] { paramString });
      GMTrace.o(20503100129280L, 152760);
      return;
    }
    if ((parame.JQ()) || (parame.JR()) || (parame.aSV()) || (parame.isPrepared()) || (parame.isPaused())) {
      parame.ahO();
    }
    parame.release();
    w.i("MicroMsg.AudioPlayerMgr", "destroyPlayer stop and release player by audioId:%s", new Object[] { paramString });
    GMTrace.o(20503100129280L, 152760);
  }
  
  private static void d(String paramString, e parame)
  {
    GMTrace.i(20503234347008L, 152761);
    w.d("MicroMsg.AudioPlayerMgr", "releasePlayer");
    c(paramString, parame);
    GMTrace.o(20503234347008L, 152761);
  }
  
  public final boolean Dq(String paramString)
  {
    GMTrace.i(20502429040640L, 152755);
    e locale = Du(paramString);
    if (locale == null)
    {
      w.e("MicroMsg.AudioPlayerMgr", "stopAudio, player is null");
      GMTrace.o(20502429040640L, 152755);
      return false;
    }
    w.i("MicroMsg.AudioPlayerMgr", "stopAudio, audioId:%s", new Object[] { paramString });
    locale.ahO();
    com.tencent.mm.ab.a locala = (com.tencent.mm.ab.a)this.nqs.get(paramString);
    if (locala != null)
    {
      locala.grQ = 0;
      locala.grR = true;
    }
    b(paramString, locale);
    f(paramString, locale);
    GMTrace.o(20502429040640L, 152755);
    return true;
  }
  
  public final boolean Dr(String paramString)
  {
    GMTrace.i(19523042279424L, 145458);
    ??? = Du(paramString);
    if (??? == null)
    {
      w.e("MicroMsg.AudioPlayerMgr", "destroyAudio, player is null");
      GMTrace.o(19523042279424L, 145458);
      return false;
    }
    w.i("MicroMsg.AudioPlayerMgr", "destroyAudio, audioId:%s", new Object[] { paramString });
    c(paramString, (e)???);
    synchronized (this.kxB)
    {
      this.nql.remove(paramString);
      this.nqm.remove(paramString);
      this.nqn.remove(paramString);
      this.nqo.remove(paramString);
      this.nqk.remove(paramString);
      ??? = this.nqp.iterator();
      while (((Iterator)???).hasNext())
      {
        String str = (String)((Iterator)???).next();
        LinkedList localLinkedList = (LinkedList)this.nqr.get(str);
        if ((localLinkedList != null) && (localLinkedList.contains(paramString)))
        {
          localLinkedList.remove(paramString);
          if (localLinkedList.size() == 0)
          {
            this.nqr.remove(str);
            this.nqp.remove(str);
            this.nqq.remove(str);
          }
        }
      }
      this.nqs.remove(paramString);
      this.nqt.remove(paramString);
      GMTrace.o(19523042279424L, 145458);
      return true;
    }
  }
  
  public final com.tencent.mm.ab.c Ds(String paramString)
  {
    GMTrace.i(20502563258368L, 152756);
    e locale = Du(paramString);
    if (locale != null)
    {
      paramString = locale.aSY();
      GMTrace.o(20502563258368L, 152756);
      return paramString;
    }
    paramString = (com.tencent.mm.ab.c)this.nqt.get(paramString);
    GMTrace.o(20502563258368L, 152756);
    return paramString;
  }
  
  public final int Dt(String paramString)
  {
    GMTrace.i(19523176497152L, 145459);
    synchronized (this.kxB)
    {
      int j = this.nqk.size();
      int k = this.nql.size();
      int m = this.nqn.size();
      paramString = (LinkedList)this.nqr.get(paramString);
      if (paramString == null)
      {
        i = 0;
        w.i("MicroMsg.AudioPlayerMgr", "getAudioPlayerCount, count:%d, player_count:%d, recycled_player_count:%d, audioIdsCount:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i) });
        GMTrace.o(19523176497152L, 145459);
        return k;
      }
      int i = paramString.size();
    }
  }
  
  public final e Du(String paramString)
  {
    GMTrace.i(19523310714880L, 145460);
    if (this.nql.containsKey(paramString))
    {
      paramString = (e)this.nql.get(paramString);
      GMTrace.o(19523310714880L, 145460);
      return paramString;
    }
    if (this.nqn.containsKey(paramString))
    {
      paramString = (e)this.nqn.get(paramString);
      GMTrace.o(19523310714880L, 145460);
      return paramString;
    }
    GMTrace.o(19523310714880L, 145460);
    return null;
  }
  
  public final void Dv(String paramString)
  {
    GMTrace.i(19523444932608L, 145461);
    w.i("MicroMsg.AudioPlayerMgr", "pauseAllAudioPlayers, appId:%s", new Object[] { paramString });
    paramString = (LinkedList)this.nqr.get(paramString);
    if ((paramString == null) || (paramString.size() == 0))
    {
      w.e("MicroMsg.AudioPlayerMgr", "there is no audioIds and players for this appId to pause");
      GMTrace.o(19523444932608L, 145461);
      return;
    }
    if ((this.nql.isEmpty()) && (this.nqn.isEmpty()))
    {
      w.e("MicroMsg.AudioPlayerMgr", "there is no audioIds and players for this appId to pause");
      GMTrace.o(19523444932608L, 145461);
      return;
    }
    Object localObject1 = paramString.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      e locale = (e)this.nqn.get(localObject2);
      if (locale != null) {
        a((String)localObject2, locale);
      }
    }
    w.i("MicroMsg.AudioPlayerMgr", "playing player count:%d", new Object[] { Integer.valueOf(this.nqm.size()) });
    paramString = paramString.iterator();
    while (paramString.hasNext())
    {
      localObject1 = (String)paramString.next();
      localObject2 = (e)this.nql.get(localObject1);
      if (localObject2 != null)
      {
        a((String)localObject1, (e)localObject2);
        f((String)localObject1, (e)localObject2);
      }
    }
    GMTrace.o(19523444932608L, 145461);
  }
  
  public final void Dw(String paramString)
  {
    GMTrace.i(19523579150336L, 145462);
    w.i("MicroMsg.AudioPlayerMgr", "destroyAllAudioPlayers, appId:%s", new Object[] { paramString });
    LinkedList localLinkedList = (LinkedList)this.nqr.remove(paramString);
    if ((localLinkedList == null) || (localLinkedList.size() == 0))
    {
      w.e("MicroMsg.AudioPlayerMgr", "there is no audioIds and players for this appId to stop");
      GMTrace.o(19523579150336L, 145462);
      return;
    }
    String str;
    e locale;
    synchronized (this.kxB)
    {
      localIterator = localLinkedList.iterator();
      if (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        locale = (e)this.nql.remove(str);
        this.nqm.remove(str);
        w.i("MicroMsg.AudioPlayerMgr", "destroy player");
        c(str, locale);
        this.nqs.remove(str);
        this.nqt.remove(str);
      }
    }
    Iterator localIterator = localLinkedList.iterator();
    while (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      locale = (e)this.nqn.remove(str);
      this.nqo.remove(str);
      w.i("MicroMsg.AudioPlayerMgr", "destroy recycled player");
      c(str, locale);
      this.nqs.remove(str);
      this.nqt.remove(str);
    }
    this.nqk.removeAll(localLinkedList);
    this.nqp.remove(paramString);
    this.nqq.remove(paramString);
    GMTrace.o(19523579150336L, 145462);
  }
  
  public final void Dx(String arg1)
  {
    GMTrace.i(20502697476096L, 152757);
    w.i("MicroMsg.AudioPlayerMgr", "destroyAllAudioPlayersAndSaveState, appId:%s", new Object[] { ??? });
    LinkedList localLinkedList = (LinkedList)this.nqr.get(???);
    if ((localLinkedList == null) || (localLinkedList.size() == 0))
    {
      w.e("MicroMsg.AudioPlayerMgr", "there is no audioIds and players for this appId to stop");
      GMTrace.o(20502697476096L, 152757);
      return;
    }
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      e locale;
      synchronized (this.kxB)
      {
        localObject2 = localLinkedList.iterator();
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        localObject3 = (String)((Iterator)localObject2).next();
        locale = (e)this.nql.remove(localObject3);
        this.nqm.remove(localObject3);
        if (locale == null) {
          continue;
        }
        b((String)localObject3, locale);
        w.i("MicroMsg.AudioPlayerMgr", "destroy player");
        if (locale.grW) {
          d((String)localObject3, locale);
        }
      }
      c((String)localObject3, locale);
    }
    Iterator localIterator = ((LinkedList)localObject1).iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (String)localIterator.next();
      localObject3 = (e)this.nqn.remove(localObject2);
      this.nqo.remove(localObject2);
      if (localObject3 != null)
      {
        b((String)localObject2, (e)localObject3);
        w.i("MicroMsg.AudioPlayerMgr", "destroy recycled player");
        if (((e)localObject3).grW) {
          d((String)localObject2, (e)localObject3);
        } else {
          c((String)localObject2, (e)localObject3);
        }
      }
    }
    GMTrace.o(20502697476096L, 152757);
  }
  
  final String Dy(String paramString)
  {
    GMTrace.i(19523847585792L, 145464);
    Iterator localIterator = this.nqp.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      LinkedList localLinkedList = (LinkedList)this.nqr.get(str);
      if ((localLinkedList != null) && (localLinkedList.contains(paramString)))
      {
        GMTrace.o(19523847585792L, 145464);
        return str;
      }
    }
    GMTrace.o(19523847585792L, 145464);
    return "";
  }
  
  final void Dz(String paramString)
  {
    GMTrace.i(20504039653376L, 152767);
    w.i("MicroMsg.AudioPlayerMgr", "recyclePlayer");
    int i = this.nql.size();
    int j = this.nqn.size();
    int k = aSB();
    w.i("MicroMsg.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d, paused_player_count:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
    if (i >= 10) {
      aSC();
    }
    Iterator localIterator;
    String str;
    for (;;)
    {
      paramString = Dy(paramString);
      i = this.nql.size();
      j = this.nqn.size();
      w.i("MicroMsg.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      if (j < 50) {
        break;
      }
      localIterator = this.nqp.iterator();
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        if ((str != null) && (!str.equalsIgnoreCase(paramString))) {
          DA(str);
        }
      }
      if (k >= 10) {
        aSC();
      } else if (i + k >= 10) {
        aSC();
      }
    }
    if (j + i >= 50)
    {
      localIterator = this.nqp.iterator();
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        if ((str != null) && (!str.equalsIgnoreCase(paramString))) {
          DA(str);
        }
      }
    }
    w.i("MicroMsg.AudioPlayerMgr", "not do recycle player, condition is not satisfy to do recycleStopPlayerByAppId");
    j = this.nqn.size();
    w.i("MicroMsg.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    if (j >= 50)
    {
      aSD();
      GMTrace.o(20504039653376L, 152767);
      return;
    }
    if (j + i >= 50)
    {
      aSD();
      GMTrace.o(20504039653376L, 152767);
      return;
    }
    w.i("MicroMsg.AudioPlayerMgr", "not do recycle player, condition is not satisfy to do recycleAllStopPlayer");
    GMTrace.o(20504039653376L, 152767);
  }
  
  public final void aSA()
  {
    GMTrace.i(20503771217920L, 152765);
    long l = System.currentTimeMillis();
    if ((this.nqv) && (l - this.nqx < 10000L))
    {
      GMTrace.o(20503771217920L, 152765);
      return;
    }
    this.nqx = l;
    synchronized (this.kxB)
    {
      this.nqv = true;
      w.i("MicroMsg.AudioPlayerMgr", "releaseAudioDelayIfPaused, delay_ms:%d", new Object[] { Integer.valueOf(1800000) });
      af.F(this.nqB);
      af.i(this.nqB, 1800000L);
      GMTrace.o(20503771217920L, 152765);
      return;
    }
  }
  
  final boolean aSE()
  {
    GMTrace.i(20504576524288L, 152771);
    boolean bool = false;
    Object localObject3;
    Object localObject5;
    HashMap localHashMap;
    for (;;)
    {
      synchronized (this.kxB)
      {
        if (this.nqm.size() < 10)
        {
          this.nqu = null;
          GMTrace.o(20504576524288L, 152771);
          return false;
        }
        localObject3 = new ArrayList();
        localObject5 = new HashMap();
        localHashMap = new HashMap();
        Iterator localIterator = this.nqm.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localObject6 = (String)localIterator.next();
        localObject6 = (com.tencent.mm.ab.a)this.nqs.get(localObject6);
        if ((localObject6 == null) || (((com.tencent.mm.ab.a)localObject6).grP == null)) {
          continue;
        }
        if (!((HashMap)localObject5).containsKey(((com.tencent.mm.ab.a)localObject6).grP))
        {
          ((HashMap)localObject5).put(((com.tencent.mm.ab.a)localObject6).grP, Integer.valueOf(1));
          localArrayList = new ArrayList();
          localArrayList.add(((com.tencent.mm.ab.a)localObject6).eAL);
          localHashMap.put(((com.tencent.mm.ab.a)localObject6).grP, localArrayList);
          if (((ArrayList)localObject3).contains(((com.tencent.mm.ab.a)localObject6).grP)) {
            continue;
          }
          ((ArrayList)localObject3).add(((com.tencent.mm.ab.a)localObject6).grP);
        }
      }
      i = ((Integer)((HashMap)localObject5).get(((com.tencent.mm.ab.a)localObject6).grP)).intValue();
      ((HashMap)localObject5).put(((com.tencent.mm.ab.a)localObject6).grP, Integer.valueOf(i + 1));
      ArrayList localArrayList = (ArrayList)localHashMap.get(((com.tencent.mm.ab.a)localObject6).grP);
      if (!localArrayList.contains(((com.tencent.mm.ab.a)localObject6).eAL)) {
        localArrayList.add(((com.tencent.mm.ab.a)localObject6).eAL);
      }
      localHashMap.put(((com.tencent.mm.ab.a)localObject6).grP, localArrayList);
    }
    Object localObject2 = "";
    at.AR();
    int i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vxi, Integer.valueOf(3))).intValue();
    w.d("MicroMsg.AudioPlayerMgr", "removePlayerGroupMinCount:%d", new Object[] { Integer.valueOf(i) });
    Object localObject6 = ((ArrayList)localObject3).iterator();
    label449:
    long l;
    if (((Iterator)localObject6).hasNext())
    {
      localObject3 = (String)((Iterator)localObject6).next();
      int j = ((Integer)((HashMap)localObject5).get(localObject3)).intValue();
      w.d("MicroMsg.AudioPlayerMgr", "count:%d, url:%s", new Object[] { Integer.valueOf(j), localObject3 });
      if (j < i) {
        break label677;
      }
      if (i < j)
      {
        localObject2 = localObject3;
        if (!TextUtils.isEmpty((CharSequence)localObject2)) {
          break label680;
        }
        bool = true;
        localObject2 = localObject3;
        break label682;
      }
    }
    else if (bool)
    {
      w.i("MicroMsg.AudioPlayerMgr", "need to remove player");
      localObject3 = (ArrayList)localHashMap.get(localObject2);
      if ((localObject3 != null) && (((ArrayList)localObject3).size() > 0))
      {
        l = ((com.tencent.mm.ab.a)this.nqs.get(((ArrayList)localObject3).get(0))).grT;
        localObject2 = ((com.tencent.mm.ab.a)this.nqs.get(((ArrayList)localObject3).get(0))).eAL;
        localObject3 = ((ArrayList)localObject3).iterator();
      }
    }
    label677:
    label680:
    label682:
    label685:
    for (;;)
    {
      if (((Iterator)localObject3).hasNext())
      {
        localObject5 = (String)((Iterator)localObject3).next();
        localObject5 = (com.tencent.mm.ab.a)this.nqs.get(localObject5);
        if (((com.tencent.mm.ab.a)localObject5).grT < l)
        {
          l = ((com.tencent.mm.ab.a)localObject5).grT;
          localObject2 = ((com.tencent.mm.ab.a)localObject5).eAL;
          break label685;
        }
      }
      else
      {
        this.nqu = ((String)localObject2);
        w.i("MicroMsg.AudioPlayerMgr", "need remove and stop player with audioId:%s", new Object[] { this.nqu });
        for (;;)
        {
          GMTrace.o(20504576524288L, 152771);
          return bool;
          w.i("MicroMsg.AudioPlayerMgr", "not need to remove player");
          this.nqu = null;
        }
      }
      break label685;
      break label449;
      break label682;
      bool = true;
      break;
    }
  }
  
  final void aSF()
  {
    GMTrace.i(20504710742016L, 152772);
    w.i("MicroMsg.AudioPlayerMgr", "removeAndStopPlayingAudioPlayer");
    Dq(this.nqu);
    GMTrace.o(20504710742016L, 152772);
  }
  
  public final void aSy()
  {
    GMTrace.i(20502160605184L, 152753);
    w.i("MicroMsg.AudioPlayerMgr", "_release");
    this.nqk.clear();
    String str;
    synchronized (this.kxB)
    {
      Iterator localIterator = this.nqm.iterator();
      if (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        c(str, (e)this.nql.remove(str));
      }
    }
    this.nqm.clear();
    this.nql.clear();
    Object localObject3 = this.nqo.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      str = (String)((Iterator)localObject3).next();
      c(str, (e)this.nqn.remove(str));
    }
    this.nqo.clear();
    this.nqn.clear();
    ??? = this.nqp.iterator();
    while (((Iterator)???).hasNext())
    {
      localObject3 = (String)((Iterator)???).next();
      localObject3 = (LinkedList)this.nqr.remove(localObject3);
      if (localObject3 != null) {
        ((LinkedList)localObject3).clear();
      }
    }
    this.nqp.clear();
    this.nqq.clear();
    this.nqr.clear();
    this.nqs.clear();
    this.nqt.clear();
    af.F(this.nqA);
    af.F(this.nqB);
    this.nqv = false;
    this.nqw = false;
    GMTrace.o(20502160605184L, 152753);
  }
  
  public final void aSz()
  {
    GMTrace.i(20503637000192L, 152764);
    if (aSB() > 0)
    {
      long l = System.currentTimeMillis();
      if ((this.nqw) && (l - this.nqy < 10000L))
      {
        GMTrace.o(20503637000192L, 152764);
        return;
      }
      synchronized (this.kxB)
      {
        this.nqw = true;
        this.nqy = l;
        w.i("MicroMsg.AudioPlayerMgr", "stopAudioDelayIfPaused, delay_ms:%d", new Object[] { Integer.valueOf(600000) });
        af.F(this.nqA);
        af.i(this.nqA, 600000L);
        GMTrace.o(20503637000192L, 152764);
        return;
      }
    }
    synchronized (this.kxB)
    {
      this.nqw = false;
      af.F(this.nqA);
      GMTrace.o(20503637000192L, 152764);
      return;
    }
  }
  
  public final void b(String paramString, e parame)
  {
    GMTrace.i(20502965911552L, 152759);
    this.nqt.put(paramString, parame.aSY());
    GMTrace.o(20502965911552L, 152759);
  }
  
  public final String dc(String paramString1, String paramString2)
  {
    GMTrace.i(20502294822912L, 152754);
    w.i("MicroMsg.AudioPlayerMgr", "createAudioPlayer");
    LinkedList localLinkedList = (LinkedList)this.nqr.get(paramString1);
    Object localObject = this.kxB;
    if (localLinkedList != null) {}
    for (;;)
    {
      try
      {
        if (localLinkedList.contains(paramString2))
        {
          if (this.nqm.contains(paramString2)) {
            break label501;
          }
          if (this.nqo.contains(paramString2))
          {
            break label501;
            if (Dt(paramString1) < 10) {
              break label271;
            }
            w.e("MicroMsg.AudioPlayerMgr", "now created QQAudioPlayer count %d arrive MAX_AUDIO_PLAYER_COUNT, save id and not send error event, not create player!", new Object[] { Integer.valueOf(localLinkedList.size()) });
            if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2))) {
              break label150;
            }
            GMTrace.o(20502294822912L, 152754);
            return null;
          }
        }
        i = 0;
        continue;
      }
      finally {}
      label150:
      tmp159_156[0] = paramString1;
      Object[] tmp163_159 = tmp159_156;
      tmp163_159[1] = paramString2;
      w.i("MicroMsg.AudioPlayerMgr", "saveCreateId, appId:%s, audioId:%s", tmp163_159);
      if (!this.nqp.contains(paramString1)) {
        this.nqp.add(paramString1);
      }
      if (!this.nqk.contains(paramString2)) {
        this.nqk.add(paramString2);
      }
      localLinkedList = (LinkedList)this.nqr.get(paramString1);
      localObject = localLinkedList;
      if (localLinkedList == null) {
        localObject = new LinkedList();
      }
      if (!((LinkedList)localObject).contains(paramString2)) {
        ((LinkedList)localObject).add(paramString2);
      }
      this.nqr.put(paramString1, localObject);
      continue;
      label271:
      if (i != 0)
      {
        w.e("MicroMsg.AudioPlayerMgr", "now created QQAudioPlayer fail, the audioId exist in mAudioIds");
        ah(603, paramString2);
        GMTrace.o(20502294822912L, 152754);
        return null;
      }
      Dz(paramString2);
      localObject = new e();
      ((e)localObject).a(this.nqz);
      if (TextUtils.isEmpty(paramString2))
      {
        paramString2 = ((e)localObject).eAL;
        this.nqk.add(paramString2);
        f(paramString2, (e)localObject);
        if (this.nqr.containsKey(paramString1)) {
          break label440;
        }
        localObject = new LinkedList();
        ((LinkedList)localObject).add(paramString2);
        this.nqr.put(paramString1, localObject);
        this.nqp.add(paramString1);
      }
      for (;;)
      {
        w.i("MicroMsg.AudioPlayerMgr", "create player success, appId:%s, audioId:%s", new Object[] { paramString1, paramString2 });
        GMTrace.o(20502294822912L, 152754);
        return paramString2;
        ((e)localObject).DD(paramString2);
        break;
        label440:
        localLinkedList = (LinkedList)this.nqr.get(paramString1);
        localObject = localLinkedList;
        if (localLinkedList == null) {
          localObject = new LinkedList();
        }
        if (!((LinkedList)localObject).contains(paramString2)) {
          ((LinkedList)localObject).add(paramString2);
        }
        this.nqr.put(paramString1, localObject);
      }
      label501:
      int i = 1;
    }
  }
  
  public final void e(String paramString, e parame)
  {
    GMTrace.i(20503368564736L, 152762);
    w.i("MicroMsg.AudioPlayerMgr", "markPlayer, mark player by audioId:%s", new Object[] { paramString });
    synchronized (this.kxB)
    {
      if (this.nqo.contains(paramString))
      {
        this.nqn.remove(paramString);
        this.nqo.remove(paramString);
      }
      if (!this.nqm.contains(paramString))
      {
        this.nqm.add(paramString);
        this.nql.put(paramString, parame);
      }
      GMTrace.o(20503368564736L, 152762);
      return;
    }
  }
  
  public final void f(String paramString, e parame)
  {
    GMTrace.i(20503502782464L, 152763);
    w.i("MicroMsg.AudioPlayerMgr", "markPlayerRecycled, mark player recycled by audioId:%s", new Object[] { paramString });
    synchronized (this.kxB)
    {
      if (this.nqm.contains(paramString))
      {
        this.nql.remove(paramString);
        this.nqm.remove(paramString);
      }
      if (!this.nqo.contains(paramString))
      {
        this.nqo.add(paramString);
        this.nqn.put(paramString, parame);
      }
      GMTrace.o(20503502782464L, 152763);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void DB(String paramString);
    
    public abstract void DC(String paramString);
    
    public abstract void onError(String paramString);
    
    public abstract void onStart(String paramString);
    
    public abstract void xB(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */