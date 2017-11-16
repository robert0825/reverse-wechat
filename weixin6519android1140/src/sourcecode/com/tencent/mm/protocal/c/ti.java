package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ti
  extends com.tencent.mm.bm.a
{
  public String desc;
  public String hLO;
  public tp tLX;
  public long tLY;
  public String title;
  public boolean ujm;
  public boolean ujn;
  public tj ukF;
  public boolean ukG;
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
  
  public ti()
  {
    GMTrace.i(3882784653312L, 28929);
    this.ukG = false;
    this.ukI = false;
    this.ukK = false;
    this.ukM = false;
    this.ukO = false;
    this.ukP = false;
    this.ujm = false;
    this.ujn = false;
    this.ukR = false;
    this.ukS = -1;
    this.ukT = false;
    this.ukU = false;
    this.ukV = false;
    GMTrace.o(3882784653312L, 28929);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3883589959680L, 28935);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ukF != null)
      {
        paramVarArgs.fm(1, this.ukF.aYq());
        this.ukF.a(paramVarArgs);
      }
      if (this.ukH != null)
      {
        paramVarArgs.fm(2, this.ukH.aYq());
        this.ukH.a(paramVarArgs);
      }
      if (this.ukJ != null)
      {
        paramVarArgs.fm(3, this.ukJ.aYq());
        this.ukJ.a(paramVarArgs);
      }
      if (this.ukL != null)
      {
        paramVarArgs.fm(4, this.ukL.aYq());
        this.ukL.a(paramVarArgs);
      }
      if (this.ukN != null)
      {
        paramVarArgs.fm(5, this.ukN.aYq());
        this.ukN.a(paramVarArgs);
      }
      if (this.hLO != null) {
        paramVarArgs.e(6, this.hLO);
      }
      if (this.title != null) {
        paramVarArgs.e(7, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.e(8, this.desc);
      }
      if (this.ukR == true) {
        paramVarArgs.T(9, this.ukQ);
      }
      if (this.ukT == true) {
        paramVarArgs.fk(101, this.ukS);
      }
      if (this.ukU == true) {
        paramVarArgs.T(11, this.tLY);
      }
      if (this.tLX != null)
      {
        paramVarArgs.fm(12, this.tLX.aYq());
        this.tLX.a(paramVarArgs);
      }
      GMTrace.o(3883589959680L, 28935);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.ukF != null) {
        i = b.a.a.a.fj(1, this.ukF.aYq()) + 0;
      }
      paramInt = i;
      if (this.ukH != null) {
        paramInt = i + b.a.a.a.fj(2, this.ukH.aYq());
      }
      i = paramInt;
      if (this.ukJ != null) {
        i = paramInt + b.a.a.a.fj(3, this.ukJ.aYq());
      }
      paramInt = i;
      if (this.ukL != null) {
        paramInt = i + b.a.a.a.fj(4, this.ukL.aYq());
      }
      i = paramInt;
      if (this.ukN != null) {
        i = paramInt + b.a.a.a.fj(5, this.ukN.aYq());
      }
      paramInt = i;
      if (this.hLO != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.hLO);
      }
      i = paramInt;
      if (this.title != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.title);
      }
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.desc);
      }
      i = paramInt;
      if (this.ukR == true) {
        i = paramInt + b.a.a.a.S(9, this.ukQ);
      }
      paramInt = i;
      if (this.ukT == true) {
        paramInt = i + b.a.a.a.fh(101, this.ukS);
      }
      i = paramInt;
      if (this.ukU == true) {
        i = paramInt + b.a.a.a.S(11, this.tLY);
      }
      paramInt = i;
      if (this.tLX != null) {
        paramInt = i + b.a.a.a.fj(12, this.tLX.aYq());
      }
      GMTrace.o(3883589959680L, 28935);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3883589959680L, 28935);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ti localti = (ti)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3883589959680L, 28935);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new tj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((tj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localti.ukF = ((tj)localObject1);
          paramInt += 1;
        }
        localti.ukG = true;
        GMTrace.o(3883589959680L, 28935);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new to();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((to)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localti.ukH = ((to)localObject1);
          paramInt += 1;
        }
        localti.ukI = true;
        GMTrace.o(3883589959680L, 28935);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new uf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((uf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localti.ukJ = ((uf)localObject1);
          paramInt += 1;
        }
        localti.ukK = true;
        GMTrace.o(3883589959680L, 28935);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ts();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ts)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localti.ukL = ((ts)localObject1);
          paramInt += 1;
        }
        localti.ukM = true;
        GMTrace.o(3883589959680L, 28935);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new tz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((tz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localti.ukN = ((tz)localObject1);
          paramInt += 1;
        }
        localti.ukO = true;
        GMTrace.o(3883589959680L, 28935);
        return 0;
      case 6: 
        localti.hLO = ((b.a.a.a.a)localObject1).yqV.readString();
        localti.ukP = true;
        GMTrace.o(3883589959680L, 28935);
        return 0;
      case 7: 
        localti.title = ((b.a.a.a.a)localObject1).yqV.readString();
        localti.ujm = true;
        GMTrace.o(3883589959680L, 28935);
        return 0;
      case 8: 
        localti.desc = ((b.a.a.a.a)localObject1).yqV.readString();
        localti.ujn = true;
        GMTrace.o(3883589959680L, 28935);
        return 0;
      case 9: 
        localti.ukQ = ((b.a.a.a.a)localObject1).yqV.nk();
        localti.ukR = true;
        GMTrace.o(3883589959680L, 28935);
        return 0;
      case 101: 
        localti.ukS = ((b.a.a.a.a)localObject1).yqV.nj();
        localti.ukT = true;
        GMTrace.o(3883589959680L, 28935);
        return 0;
      case 11: 
        localti.tLY = ((b.a.a.a.a)localObject1).yqV.nk();
        localti.ukU = true;
        GMTrace.o(3883589959680L, 28935);
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
        localti.tLX = ((tp)localObject1);
        paramInt += 1;
      }
      localti.ukV = true;
      GMTrace.o(3883589959680L, 28935);
      return 0;
    }
    GMTrace.o(3883589959680L, 28935);
    return -1;
  }
  
  public final ti a(to paramto)
  {
    GMTrace.i(3883053088768L, 28931);
    this.ukH = paramto;
    this.ukI = true;
    GMTrace.o(3883053088768L, 28931);
    return this;
  }
  
  public final ti a(ts paramts)
  {
    GMTrace.i(3883321524224L, 28933);
    this.ukL = paramts;
    this.ukM = true;
    GMTrace.o(3883321524224L, 28933);
    return this;
  }
  
  public final ti a(tz paramtz)
  {
    GMTrace.i(3883455741952L, 28934);
    this.ukN = paramtz;
    this.ukO = true;
    GMTrace.o(3883455741952L, 28934);
    return this;
  }
  
  public final ti a(uf paramuf)
  {
    GMTrace.i(3883187306496L, 28932);
    this.ukJ = paramuf;
    this.ukK = true;
    GMTrace.o(3883187306496L, 28932);
    return this;
  }
  
  public final ti c(tj paramtj)
  {
    GMTrace.i(3882918871040L, 28930);
    this.ukF = paramtj;
    this.ukG = true;
    GMTrace.o(3882918871040L, 28930);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */