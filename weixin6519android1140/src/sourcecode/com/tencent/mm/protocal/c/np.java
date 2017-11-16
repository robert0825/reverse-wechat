package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class np
  extends com.tencent.mm.bm.a
{
  public String jxI;
  public String jxJ;
  public String nDw;
  public String tZx;
  public String tZy;
  public String title;
  public long uaJ;
  public String uaK;
  public String uaL;
  public agi uep;
  public String url;
  
  public np()
  {
    GMTrace.i(3766552100864L, 28063);
    GMTrace.o(3766552100864L, 28063);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3766686318592L, 28064);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.jxI != null) {
        paramVarArgs.e(2, this.jxI);
      }
      if (this.jxJ != null) {
        paramVarArgs.e(3, this.jxJ);
      }
      if (this.url != null) {
        paramVarArgs.e(4, this.url);
      }
      paramVarArgs.T(5, this.uaJ);
      if (this.uaK != null) {
        paramVarArgs.e(6, this.uaK);
      }
      if (this.uaL != null) {
        paramVarArgs.e(7, this.uaL);
      }
      if (this.nDw != null) {
        paramVarArgs.e(8, this.nDw);
      }
      if (this.uep != null)
      {
        paramVarArgs.fm(9, this.uep.aYq());
        this.uep.a(paramVarArgs);
      }
      if (this.tZx != null) {
        paramVarArgs.e(10, this.tZx);
      }
      if (this.tZy != null) {
        paramVarArgs.e(11, this.tZy);
      }
      GMTrace.o(3766686318592L, 28064);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.title != null) {
        i = b.a.a.b.b.a.f(1, this.title) + 0;
      }
      paramInt = i;
      if (this.jxI != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jxI);
      }
      i = paramInt;
      if (this.jxJ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jxJ);
      }
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.url);
      }
      i = paramInt + b.a.a.a.S(5, this.uaJ);
      paramInt = i;
      if (this.uaK != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uaK);
      }
      i = paramInt;
      if (this.uaL != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uaL);
      }
      paramInt = i;
      if (this.nDw != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.nDw);
      }
      i = paramInt;
      if (this.uep != null) {
        i = paramInt + b.a.a.a.fj(9, this.uep.aYq());
      }
      paramInt = i;
      if (this.tZx != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tZx);
      }
      i = paramInt;
      if (this.tZy != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.tZy);
      }
      GMTrace.o(3766686318592L, 28064);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3766686318592L, 28064);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      np localnp = (np)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3766686318592L, 28064);
        return -1;
      case 1: 
        localnp.title = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 2: 
        localnp.jxI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 3: 
        localnp.jxJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 4: 
        localnp.url = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 5: 
        localnp.uaJ = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 6: 
        localnp.uaK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 7: 
        localnp.uaL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 8: 
        localnp.nDw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agi();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((agi)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localnp.uep = ((agi)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3766686318592L, 28064);
        return 0;
      case 10: 
        localnp.tZx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3766686318592L, 28064);
        return 0;
      }
      localnp.tZy = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3766686318592L, 28064);
      return 0;
    }
    GMTrace.o(3766686318592L, 28064);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\np.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */