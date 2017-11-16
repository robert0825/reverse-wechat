package com.google.android.gms.tagmanager;

import com.google.android.gms.c.a;
import com.google.android.gms.c.at;
import com.google.android.gms.c.at.a;
import com.google.android.gms.c.at.b;
import com.google.android.gms.c.b.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class ac
{
  private static final v<b.a> ayT = new v(ai.mP(), true);
  private final f ayU;
  private final Map<String, g> ayV;
  private final Map<String, g> ayW;
  private final Map<String, g> ayX;
  private final al<at.a, v<b.a>> ayY;
  private final al<String, b> ayZ;
  private final c ayx;
  private final Set<at.b> aza;
  private final Map<String, c> azb;
  private volatile String azc;
  private int azd;
  
  private v<Boolean> a(at.a parama, Set<String> paramSet, x paramx)
  {
    parama = a(this.ayW, parama, paramSet, paramx);
    paramSet = ai.c((b.a)parama.ayJ);
    ai.ah(paramSet);
    return new v(paramSet, parama.ayK);
  }
  
  private v<Boolean> a(at.b paramb, Set<String> paramSet, aa paramaa)
  {
    Object localObject = paramb.awn.iterator();
    boolean bool = true;
    if (((Iterator)localObject).hasNext())
    {
      v localv = a((at.a)((Iterator)localObject).next(), paramSet, paramaa.mx());
      if (((Boolean)localv.ayJ).booleanValue())
      {
        ai.ah(Boolean.valueOf(false));
        return new v(Boolean.valueOf(false), localv.ayK);
      }
      if ((bool) && (localv.ayK)) {}
      for (bool = true;; bool = false) {
        break;
      }
    }
    paramb = paramb.awm.iterator();
    while (paramb.hasNext())
    {
      localObject = a((at.a)paramb.next(), paramSet, paramaa.my());
      if (!((Boolean)((v)localObject).ayJ).booleanValue())
      {
        ai.ah(Boolean.valueOf(false));
        return new v(Boolean.valueOf(false), ((v)localObject).ayK);
      }
      if ((bool) && (((v)localObject).ayK)) {
        bool = true;
      } else {
        bool = false;
      }
    }
    ai.ah(Boolean.valueOf(true));
    return new v(Boolean.valueOf(true), bool);
  }
  
  private v<b.a> a(b.a parama, Set<String> paramSet, aj paramaj)
  {
    if (!parama.ati) {
      return new v(parama, true);
    }
    v localv1;
    switch (parama.type)
    {
    case 5: 
    case 6: 
    default: 
      new StringBuilder("Unknown type: ").append(parama.type);
      m.mo();
      return ayT;
    case 2: 
      locala = at.a(parama);
      locala.asZ = new b.a[parama.asZ.length];
      i = 0;
      while (i < parama.asZ.length)
      {
        localv1 = a(parama.asZ[i], paramSet, paramaj.mE());
        if (localv1 == ayT) {
          return ayT;
        }
        locala.asZ[i] = ((b.a)localv1.ayJ);
        i += 1;
      }
      return new v(locala, false);
    case 3: 
      locala = at.a(parama);
      if (parama.ata.length != parama.atb.length)
      {
        new StringBuilder("Invalid serving value: ").append(parama.toString());
        m.mo();
        return ayT;
      }
      locala.ata = new b.a[parama.ata.length];
      locala.atb = new b.a[parama.ata.length];
      i = 0;
      while (i < parama.ata.length)
      {
        localv1 = a(parama.ata[i], paramSet, paramaj.mF());
        v localv2 = a(parama.atb[i], paramSet, paramaj.mG());
        if ((localv1 == ayT) || (localv2 == ayT)) {
          return ayT;
        }
        locala.ata[i] = ((b.a)localv1.ayJ);
        locala.atb[i] = ((b.a)localv2.ayJ);
        i += 1;
      }
      return new v(locala, false);
    case 4: 
      if (paramSet.contains(parama.atc))
      {
        new StringBuilder("Macro cycle detected.  Current macro reference: ").append(parama.atc).append(".  Previous macro references: ").append(paramSet.toString()).append(".");
        m.mo();
        return ayT;
      }
      paramSet.add(parama.atc);
      paramaj = ak.a(a(parama.atc, paramSet, paramaj.mI()), parama.ath);
      paramSet.remove(parama.atc);
      return paramaj;
    }
    b.a locala = at.a(parama);
    locala.atg = new b.a[parama.atg.length];
    int i = 0;
    while (i < parama.atg.length)
    {
      localv1 = a(parama.atg[i], paramSet, paramaj.mH());
      if (localv1 == ayT) {
        return ayT;
      }
      locala.atg[i] = ((b.a)localv1.ayJ);
      i += 1;
    }
    return new v(locala, false);
  }
  
  private v<b.a> a(String paramString, Set<String> paramSet, o paramo)
  {
    this.azd += 1;
    Object localObject = (b)this.ayZ.mQ();
    if ((localObject != null) && (!this.ayU.ml()))
    {
      a(((b)localObject).awl, paramSet);
      this.azd -= 1;
      return ((b)localObject).azj;
    }
    c localc = (c)this.azb.get(paramString);
    if (localc == null)
    {
      new StringBuilder().append(mL()).append("Invalid macro: ").append(paramString);
      m.mo();
      this.azd -= 1;
      return ayT;
    }
    localObject = a(localc.aza, localc.azk, localc.azm, localc.azl, localc.azn, paramSet, paramo.mu());
    if (((Set)((v)localObject).ayJ).isEmpty()) {}
    for (paramString = localc.azo; paramString == null; paramString = (at.a)((Set)((v)localObject).ayJ).iterator().next())
    {
      this.azd -= 1;
      return ayT;
      if (((Set)((v)localObject).ayJ).size() > 1)
      {
        new StringBuilder().append(mL()).append("Multiple macros active for macroName ").append(paramString);
        m.mq();
      }
    }
    paramo = a(this.ayX, paramString, paramSet, paramo.mt());
    boolean bool;
    if ((((v)localObject).ayK) && (paramo.ayK))
    {
      bool = true;
      if (paramo != ayT) {
        break label369;
      }
    }
    label369:
    for (paramo = ayT;; paramo = new v(paramo.ayJ, bool))
    {
      paramString = paramString.awl;
      if (paramo.ayK) {
        new b(paramo, paramString);
      }
      a(paramString, paramSet);
      this.azd -= 1;
      return paramo;
      bool = false;
      break;
    }
  }
  
  private v<b.a> a(Map<String, g> paramMap, at.a parama, Set<String> paramSet, x paramx)
  {
    Object localObject1 = (b.a)Collections.unmodifiableMap(parama.awk).get(a.aqt.toString());
    if (localObject1 == null)
    {
      m.mo();
      paramMap = ayT;
    }
    g localg;
    do
    {
      return paramMap;
      localObject1 = ((b.a)localObject1).atd;
      localg = (g)paramMap.get(localObject1);
      if (localg == null)
      {
        new StringBuilder().append((String)localObject1).append(" has no backing implementation.");
        m.mo();
        return ayT;
      }
      paramMap = (v)this.ayY.mQ();
    } while ((paramMap != null) && (!this.ayU.ml()));
    paramMap = new HashMap();
    Iterator localIterator = Collections.unmodifiableMap(parama.awk).entrySet().iterator();
    int i = 1;
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localEntry.getKey();
      Object localObject2 = paramx.mv();
      Object localObject3 = (b.a)localEntry.getValue();
      localEntry.getValue();
      localObject2 = a((b.a)localObject3, paramSet, ((z)localObject2).mw());
      if (localObject2 == ayT) {
        return ayT;
      }
      if (((v)localObject2).ayK)
      {
        localObject3 = (String)localEntry.getKey();
        b.a locala = (b.a)((v)localObject2).ayJ;
        parama.awk.put(localObject3, locala);
      }
      for (;;)
      {
        paramMap.put(localEntry.getKey(), ((v)localObject2).ayJ);
        break;
        i = 0;
      }
    }
    if (!paramMap.keySet().containsAll(localg.ayE))
    {
      new StringBuilder("Incorrect keys for function ").append((String)localObject1).append(" required ").append(localg.ayE).append(" had ").append(paramMap.keySet());
      m.mo();
      return ayT;
    }
    if ((i != 0) && (localg.mm())) {}
    for (boolean bool = true;; bool = false) {
      return new v(localg.mn(), bool);
    }
  }
  
  private v<Set<at.a>> a(Set<at.b> paramSet, final Map<at.b, List<at.a>> paramMap1, final Map<at.b, List<String>> paramMap2, final Map<at.b, List<at.a>> paramMap3, final Map<at.b, List<String>> paramMap4, Set<String> paramSet1, ab paramab)
  {
    a(paramSet, paramSet1, new a()
    {
      public final void a(at.b paramAnonymousb, Set<at.a> paramAnonymousSet1, Set<at.a> paramAnonymousSet2, aa paramAnonymousaa)
      {
        List localList = (List)paramMap1.get(paramAnonymousb);
        paramMap2.get(paramAnonymousb);
        if (localList != null)
        {
          paramAnonymousSet1.addAll(localList);
          paramAnonymousaa.mz();
        }
        paramAnonymousSet1 = (List)paramMap3.get(paramAnonymousb);
        paramMap4.get(paramAnonymousb);
        if (paramAnonymousSet1 != null)
        {
          paramAnonymousSet2.addAll(paramAnonymousSet1);
          paramAnonymousaa.mA();
        }
      }
    }, paramab);
  }
  
  private v<Set<at.a>> a(Set<at.b> paramSet, Set<String> paramSet1, a parama, ab paramab)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    paramSet = paramSet.iterator();
    boolean bool = true;
    if (paramSet.hasNext())
    {
      at.b localb = (at.b)paramSet.next();
      aa localaa = paramab.mD();
      v localv = a(localb, paramSet1, localaa);
      if (((Boolean)localv.ayJ).booleanValue()) {
        parama.a(localb, localHashSet1, localHashSet2, localaa);
      }
      if ((bool) && (localv.ayK)) {}
      for (bool = true;; bool = false) {
        break;
      }
    }
    localHashSet1.removeAll(localHashSet2);
    return new v(localHashSet1, bool);
  }
  
  private void a(b.a parama, Set<String> paramSet)
  {
    if (parama == null) {}
    for (;;)
    {
      return;
      parama = a(parama, paramSet, new u());
      if (parama != ayT)
      {
        parama = ai.d((b.a)parama.ayJ);
        if ((parama instanceof Map))
        {
          parama = (Map)parama;
          this.ayx.d(parama);
          return;
        }
        if (!(parama instanceof List)) {
          break;
        }
        parama = ((List)parama).iterator();
        while (parama.hasNext())
        {
          paramSet = parama.next();
          if ((paramSet instanceof Map))
          {
            paramSet = (Map)paramSet;
            this.ayx.d(paramSet);
          }
          else
          {
            m.mq();
          }
        }
      }
    }
    m.mq();
  }
  
  private void aA(String paramString)
  {
    try
    {
      this.azc = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private String mL()
  {
    if (this.azd <= 1) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Integer.toString(this.azd));
    int i = 2;
    while (i < this.azd)
    {
      localStringBuilder.append(' ');
      i += 1;
    }
    localStringBuilder.append(": ");
    return localStringBuilder.toString();
  }
  
  public final void az(String paramString)
  {
    try
    {
      aA(paramString);
      paramString = this.ayU.mk().mj();
      Object localObject1 = this.aza;
      Object localObject2 = paramString.mu();
      localObject1 = ((Set)
      {
        public final void a(at.b paramAnonymousb, Set<at.a> paramAnonymousSet1, Set<at.a> paramAnonymousSet2, aa paramAnonymousaa)
        {
          paramAnonymousSet1.addAll(paramAnonymousb.awo);
          paramAnonymousSet2.addAll(paramAnonymousb.awp);
          paramAnonymousaa.mB();
          paramAnonymousaa.mC();
        }
      }).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (at.a)((Iterator)localObject1).next();
        a(this.ayV, (at.a)localObject2, new HashSet(), paramString.mU());
      }
      aA(null);
    }
    finally {}
  }
  
  static abstract interface a
  {
    public abstract void a(at.b paramb, Set<at.a> paramSet1, Set<at.a> paramSet2, aa paramaa);
  }
  
  private static final class b
  {
    b.a awl;
    v<b.a> azj;
    
    public b(v<b.a> paramv, b.a parama)
    {
      this.azj = paramv;
      this.awl = parama;
    }
  }
  
  private static final class c
  {
    final Set<at.b> aza = new HashSet();
    final Map<at.b, List<at.a>> azk = new HashMap();
    final Map<at.b, List<at.a>> azl = new HashMap();
    final Map<at.b, List<String>> azm = new HashMap();
    final Map<at.b, List<String>> azn = new HashMap();
    at.a azo;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\tagmanager\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */