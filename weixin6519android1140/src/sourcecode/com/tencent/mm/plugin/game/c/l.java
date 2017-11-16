package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class l
  extends com.tencent.mm.bm.a
{
  public String lPR;
  public String lPS;
  public String lPT;
  public co lPU;
  public int lPV;
  public int lPW;
  public String lPX;
  public int lPY;
  
  public l()
  {
    GMTrace.i(12649618210816L, 94247);
    GMTrace.o(12649618210816L, 94247);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12649752428544L, 94248);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPR == null) {
        throw new b("Not all required fields were included: DownloadURL");
      }
      if (this.lPR != null) {
        paramVarArgs.e(1, this.lPR);
      }
      if (this.lPS != null) {
        paramVarArgs.e(2, this.lPS);
      }
      if (this.lPT != null) {
        paramVarArgs.e(4, this.lPT);
      }
      if (this.lPU != null)
      {
        paramVarArgs.fm(5, this.lPU.aYq());
        this.lPU.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.lPV);
      paramVarArgs.fk(7, this.lPW);
      if (this.lPX != null) {
        paramVarArgs.e(8, this.lPX);
      }
      paramVarArgs.fk(9, this.lPY);
      GMTrace.o(12649752428544L, 94248);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.lPR != null) {
        i = b.a.a.b.b.a.f(1, this.lPR) + 0;
      }
      paramInt = i;
      if (this.lPS != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPS);
      }
      i = paramInt;
      if (this.lPT != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.lPT);
      }
      paramInt = i;
      if (this.lPU != null) {
        paramInt = i + b.a.a.a.fj(5, this.lPU.aYq());
      }
      i = paramInt + b.a.a.a.fh(6, this.lPV) + b.a.a.a.fh(7, this.lPW);
      paramInt = i;
      if (this.lPX != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.lPX);
      }
      i = b.a.a.a.fh(9, this.lPY);
      GMTrace.o(12649752428544L, 94248);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.lPR == null) {
        throw new b("Not all required fields were included: DownloadURL");
      }
      GMTrace.o(12649752428544L, 94248);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      l locall = (l)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 3: 
      default: 
        GMTrace.o(12649752428544L, 94248);
        return -1;
      case 1: 
        locall.lPR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12649752428544L, 94248);
        return 0;
      case 2: 
        locall.lPS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12649752428544L, 94248);
        return 0;
      case 4: 
        locall.lPT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12649752428544L, 94248);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new co();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((co)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locall.lPU = ((co)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12649752428544L, 94248);
        return 0;
      case 6: 
        locall.lPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12649752428544L, 94248);
        return 0;
      case 7: 
        locall.lPW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12649752428544L, 94248);
        return 0;
      case 8: 
        locall.lPX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12649752428544L, 94248);
        return 0;
      }
      locall.lPY = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(12649752428544L, 94248);
      return 0;
    }
    GMTrace.o(12649752428544L, 94248);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */