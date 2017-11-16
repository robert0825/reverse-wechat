package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class as
  extends com.tencent.mm.bm.a
{
  public int jib;
  public String lPM;
  public int tOG;
  public String tOH;
  public String tOI;
  public String tOJ;
  public aq tOK;
  public String tOL;
  public cm tOM;
  public cu tON;
  public ct tOO;
  public ct tOP;
  
  public as()
  {
    GMTrace.i(3904930578432L, 29094);
    GMTrace.o(3904930578432L, 29094);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3905064796160L, 29095);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jib);
      if (this.lPM != null) {
        paramVarArgs.e(2, this.lPM);
      }
      paramVarArgs.fk(3, this.tOG);
      if (this.tOH != null) {
        paramVarArgs.e(4, this.tOH);
      }
      if (this.tOI != null) {
        paramVarArgs.e(5, this.tOI);
      }
      if (this.tOJ != null) {
        paramVarArgs.e(6, this.tOJ);
      }
      if (this.tOK != null)
      {
        paramVarArgs.fm(7, this.tOK.aYq());
        this.tOK.a(paramVarArgs);
      }
      if (this.tOL != null) {
        paramVarArgs.e(8, this.tOL);
      }
      if (this.tOM != null)
      {
        paramVarArgs.fm(9, this.tOM.aYq());
        this.tOM.a(paramVarArgs);
      }
      if (this.tON != null)
      {
        paramVarArgs.fm(10, this.tON.aYq());
        this.tON.a(paramVarArgs);
      }
      if (this.tOO != null)
      {
        paramVarArgs.fm(11, this.tOO.aYq());
        this.tOO.a(paramVarArgs);
      }
      if (this.tOP != null)
      {
        paramVarArgs.fm(12, this.tOP.aYq());
        this.tOP.a(paramVarArgs);
      }
      GMTrace.o(3905064796160L, 29095);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.jib) + 0;
      paramInt = i;
      if (this.lPM != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPM);
      }
      i = paramInt + b.a.a.a.fh(3, this.tOG);
      paramInt = i;
      if (this.tOH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tOH);
      }
      i = paramInt;
      if (this.tOI != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tOI);
      }
      paramInt = i;
      if (this.tOJ != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tOJ);
      }
      i = paramInt;
      if (this.tOK != null) {
        i = paramInt + b.a.a.a.fj(7, this.tOK.aYq());
      }
      paramInt = i;
      if (this.tOL != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tOL);
      }
      i = paramInt;
      if (this.tOM != null) {
        i = paramInt + b.a.a.a.fj(9, this.tOM.aYq());
      }
      paramInt = i;
      if (this.tON != null) {
        paramInt = i + b.a.a.a.fj(10, this.tON.aYq());
      }
      i = paramInt;
      if (this.tOO != null) {
        i = paramInt + b.a.a.a.fj(11, this.tOO.aYq());
      }
      paramInt = i;
      if (this.tOP != null) {
        paramInt = i + b.a.a.a.fj(12, this.tOP.aYq());
      }
      GMTrace.o(3905064796160L, 29095);
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
      GMTrace.o(3905064796160L, 29095);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      as localas = (as)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3905064796160L, 29095);
        return -1;
      case 1: 
        localas.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3905064796160L, 29095);
        return 0;
      case 2: 
        localas.lPM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3905064796160L, 29095);
        return 0;
      case 3: 
        localas.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3905064796160L, 29095);
        return 0;
      case 4: 
        localas.tOH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3905064796160L, 29095);
        return 0;
      case 5: 
        localas.tOI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3905064796160L, 29095);
        return 0;
      case 6: 
        localas.tOJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3905064796160L, 29095);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localas.tOK = ((aq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3905064796160L, 29095);
        return 0;
      case 8: 
        localas.tOL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3905064796160L, 29095);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localas.tOM = ((cm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3905064796160L, 29095);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localas.tON = ((cu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3905064796160L, 29095);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ct();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ct)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localas.tOO = ((ct)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3905064796160L, 29095);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ct();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ct)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localas.tOP = ((ct)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3905064796160L, 29095);
      return 0;
    }
    GMTrace.o(3905064796160L, 29095);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */