package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class tt
  extends com.tencent.mm.bm.a
{
  public String desc;
  public String hLO;
  public tp tLX;
  public long tLY;
  public String title;
  public boolean ujm;
  public boolean ujn;
  public to ukH;
  public boolean ukI;
  public uf ukJ;
  public boolean ukK;
  public ts ukL;
  public boolean ukM;
  public tz ukN;
  public boolean ukO;
  public boolean ukP;
  public long ukQ;
  public boolean ukR;
  public int ukS;
  public boolean ukT;
  public boolean ukU;
  public boolean ukV;
  public boolean ulA;
  public LinkedList<th> ulB;
  public boolean ulC;
  public boolean ulD;
  public tw ulz;
  public int version;
  
  public tt()
  {
    GMTrace.i(3693806092288L, 27521);
    this.ulA = false;
    this.ulB = new LinkedList();
    this.ulC = false;
    this.ukI = false;
    this.ukK = false;
    this.ukP = false;
    this.ujm = false;
    this.ujn = false;
    this.ukR = false;
    this.ukS = -1;
    this.ukT = false;
    this.ukM = false;
    this.ukU = false;
    this.ukO = false;
    this.ulD = false;
    this.ukV = false;
    GMTrace.o(3693806092288L, 27521);
  }
  
  public final tt QV(String paramString)
  {
    GMTrace.i(3694477180928L, 27526);
    this.hLO = paramString;
    this.ukP = true;
    GMTrace.o(3694477180928L, 27526);
    return this;
  }
  
  public final tt QW(String paramString)
  {
    GMTrace.i(3694611398656L, 27527);
    this.title = paramString;
    this.ujm = true;
    GMTrace.o(3694611398656L, 27527);
    return this;
  }
  
  public final tt QX(String paramString)
  {
    GMTrace.i(3694745616384L, 27528);
    this.desc = paramString;
    this.ujn = true;
    GMTrace.o(3694745616384L, 27528);
    return this;
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3695685140480L, 27535);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ulz != null)
      {
        paramVarArgs.fm(1, this.ulz.aYq());
        this.ulz.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.ulB);
      if (this.ukH != null)
      {
        paramVarArgs.fm(3, this.ukH.aYq());
        this.ukH.a(paramVarArgs);
      }
      if (this.ukJ != null)
      {
        paramVarArgs.fm(4, this.ukJ.aYq());
        this.ukJ.a(paramVarArgs);
      }
      if (this.hLO != null) {
        paramVarArgs.e(5, this.hLO);
      }
      if (this.title != null) {
        paramVarArgs.e(6, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.e(7, this.desc);
      }
      if (this.ukR == true) {
        paramVarArgs.T(8, this.ukQ);
      }
      if (this.ukT == true) {
        paramVarArgs.fk(91, this.ukS);
      }
      if (this.ukL != null)
      {
        paramVarArgs.fm(10, this.ukL.aYq());
        this.ukL.a(paramVarArgs);
      }
      if (this.ukU == true) {
        paramVarArgs.T(11, this.tLY);
      }
      if (this.ukN != null)
      {
        paramVarArgs.fm(12, this.ukN.aYq());
        this.ukN.a(paramVarArgs);
      }
      if (this.ulD == true) {
        paramVarArgs.fk(13, this.version);
      }
      if (this.tLX != null)
      {
        paramVarArgs.fm(14, this.tLX.aYq());
        this.tLX.a(paramVarArgs);
      }
      GMTrace.o(3695685140480L, 27535);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ulz != null) {
        paramInt = b.a.a.a.fj(1, this.ulz.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.ulB);
      paramInt = i;
      if (this.ukH != null) {
        paramInt = i + b.a.a.a.fj(3, this.ukH.aYq());
      }
      i = paramInt;
      if (this.ukJ != null) {
        i = paramInt + b.a.a.a.fj(4, this.ukJ.aYq());
      }
      paramInt = i;
      if (this.hLO != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.hLO);
      }
      i = paramInt;
      if (this.title != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.title);
      }
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.desc);
      }
      i = paramInt;
      if (this.ukR == true) {
        i = paramInt + b.a.a.a.S(8, this.ukQ);
      }
      paramInt = i;
      if (this.ukT == true) {
        paramInt = i + b.a.a.a.fh(91, this.ukS);
      }
      i = paramInt;
      if (this.ukL != null) {
        i = paramInt + b.a.a.a.fj(10, this.ukL.aYq());
      }
      paramInt = i;
      if (this.ukU == true) {
        paramInt = i + b.a.a.a.S(11, this.tLY);
      }
      i = paramInt;
      if (this.ukN != null) {
        i = paramInt + b.a.a.a.fj(12, this.ukN.aYq());
      }
      paramInt = i;
      if (this.ulD == true) {
        paramInt = i + b.a.a.a.fh(13, this.version);
      }
      i = paramInt;
      if (this.tLX != null) {
        i = paramInt + b.a.a.a.fj(14, this.tLX.aYq());
      }
      GMTrace.o(3695685140480L, 27535);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ulB.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3695685140480L, 27535);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      tt localtt = (tt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3695685140480L, 27535);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new tw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((tw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localtt.ulz = ((tw)localObject1);
          paramInt += 1;
        }
        localtt.ulA = true;
        GMTrace.o(3695685140480L, 27535);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new th();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((th)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localtt.ulB.add(localObject1);
          paramInt += 1;
        }
        localtt.ulC = true;
        GMTrace.o(3695685140480L, 27535);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new to();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((to)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localtt.ukH = ((to)localObject1);
          paramInt += 1;
        }
        localtt.ukI = true;
        GMTrace.o(3695685140480L, 27535);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new uf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((uf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localtt.ukJ = ((uf)localObject1);
          paramInt += 1;
        }
        localtt.ukK = true;
        GMTrace.o(3695685140480L, 27535);
        return 0;
      case 5: 
        localtt.hLO = ((b.a.a.a.a)localObject1).yqV.readString();
        localtt.ukP = true;
        GMTrace.o(3695685140480L, 27535);
        return 0;
      case 6: 
        localtt.title = ((b.a.a.a.a)localObject1).yqV.readString();
        localtt.ujm = true;
        GMTrace.o(3695685140480L, 27535);
        return 0;
      case 7: 
        localtt.desc = ((b.a.a.a.a)localObject1).yqV.readString();
        localtt.ujn = true;
        GMTrace.o(3695685140480L, 27535);
        return 0;
      case 8: 
        localtt.ukQ = ((b.a.a.a.a)localObject1).yqV.nk();
        localtt.ukR = true;
        GMTrace.o(3695685140480L, 27535);
        return 0;
      case 91: 
        localtt.ukS = ((b.a.a.a.a)localObject1).yqV.nj();
        localtt.ukT = true;
        GMTrace.o(3695685140480L, 27535);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ts();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ts)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localtt.ukL = ((ts)localObject1);
          paramInt += 1;
        }
        localtt.ukM = true;
        GMTrace.o(3695685140480L, 27535);
        return 0;
      case 11: 
        localtt.tLY = ((b.a.a.a.a)localObject1).yqV.nk();
        localtt.ukU = true;
        GMTrace.o(3695685140480L, 27535);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new tz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((tz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localtt.ukN = ((tz)localObject1);
          paramInt += 1;
        }
        localtt.ukO = true;
        GMTrace.o(3695685140480L, 27535);
        return 0;
      case 13: 
        localtt.version = ((b.a.a.a.a)localObject1).yqV.nj();
        localtt.ulD = true;
        GMTrace.o(3695685140480L, 27535);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new tp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((tp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localtt.tLX = ((tp)localObject1);
        paramInt += 1;
      }
      localtt.ukV = true;
      GMTrace.o(3695685140480L, 27535);
      return 0;
    }
    GMTrace.o(3695685140480L, 27535);
    return -1;
  }
  
  public final tt a(tp paramtp)
  {
    GMTrace.i(20969909387264L, 156238);
    this.tLX = paramtp;
    this.ukV = true;
    GMTrace.o(20969909387264L, 156238);
    return this;
  }
  
  public final tt a(tw paramtw)
  {
    GMTrace.i(3693940310016L, 27522);
    this.ulz = paramtw;
    this.ulA = true;
    GMTrace.o(3693940310016L, 27522);
    return this;
  }
  
  public final tt av(LinkedList<th> paramLinkedList)
  {
    GMTrace.i(3694074527744L, 27523);
    this.ulB = paramLinkedList;
    this.ulC = true;
    GMTrace.o(3694074527744L, 27523);
    return this;
  }
  
  public final tt b(to paramto)
  {
    GMTrace.i(3694208745472L, 27524);
    this.ukH = paramto;
    this.ukI = true;
    GMTrace.o(3694208745472L, 27524);
    return this;
  }
  
  public final tt b(ts paramts)
  {
    GMTrace.i(3695148269568L, 27531);
    this.ukL = paramts;
    this.ukM = true;
    GMTrace.o(3695148269568L, 27531);
    return this;
  }
  
  public final tt b(tz paramtz)
  {
    GMTrace.i(3695416705024L, 27533);
    this.ukN = paramtz;
    this.ukO = true;
    GMTrace.o(3695416705024L, 27533);
    return this;
  }
  
  public final tt b(uf paramuf)
  {
    GMTrace.i(3694342963200L, 27525);
    this.ukJ = paramuf;
    this.ukK = true;
    GMTrace.o(3694342963200L, 27525);
    return this;
  }
  
  public final tt eC(long paramLong)
  {
    GMTrace.i(3694879834112L, 27529);
    this.ukQ = paramLong;
    this.ukR = true;
    GMTrace.o(3694879834112L, 27529);
    return this;
  }
  
  public final tt eD(long paramLong)
  {
    GMTrace.i(3695282487296L, 27532);
    this.tLY = paramLong;
    this.ukU = true;
    GMTrace.o(3695282487296L, 27532);
    return this;
  }
  
  public final tt zX(int paramInt)
  {
    GMTrace.i(3695014051840L, 27530);
    this.ukS = paramInt;
    this.ukT = true;
    GMTrace.o(3695014051840L, 27530);
    return this;
  }
  
  public final tt zY(int paramInt)
  {
    GMTrace.i(3695550922752L, 27534);
    this.version = paramInt;
    this.ulD = true;
    GMTrace.o(3695550922752L, 27534);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\tt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */