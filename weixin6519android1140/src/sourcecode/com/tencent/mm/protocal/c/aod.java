package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aod
  extends com.tencent.mm.bm.a
{
  public int jib;
  public int nFd;
  public String nIp;
  public azq tPX;
  public String tQb;
  public int uEe;
  
  public aod()
  {
    GMTrace.i(13337618284544L, 99373);
    GMTrace.o(13337618284544L, 99373);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13337752502272L, 99374);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.tPX != null)
      {
        paramVarArgs.fm(1, this.tPX.aYq());
        this.tPX.a(paramVarArgs);
      }
      if (this.nIp != null) {
        paramVarArgs.e(2, this.nIp);
      }
      paramVarArgs.fk(3, this.jib);
      paramVarArgs.fk(4, this.nFd);
      paramVarArgs.fk(5, this.uEe);
      if (this.tQb != null) {
        paramVarArgs.e(6, this.tQb);
      }
      GMTrace.o(13337752502272L, 99374);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tPX != null) {
        paramInt = b.a.a.a.fj(1, this.tPX.aYq()) + 0;
      }
      i = paramInt;
      if (this.nIp != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.nIp);
      }
      i = i + b.a.a.a.fh(3, this.jib) + b.a.a.a.fh(4, this.nFd) + b.a.a.a.fh(5, this.uEe);
      paramInt = i;
      if (this.tQb != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tQb);
      }
      GMTrace.o(13337752502272L, 99374);
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
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      GMTrace.o(13337752502272L, 99374);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aod localaod = (aod)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13337752502272L, 99374);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaod.tPX = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13337752502272L, 99374);
        return 0;
      case 2: 
        localaod.nIp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13337752502272L, 99374);
        return 0;
      case 3: 
        localaod.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13337752502272L, 99374);
        return 0;
      case 4: 
        localaod.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13337752502272L, 99374);
        return 0;
      case 5: 
        localaod.uEe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13337752502272L, 99374);
        return 0;
      }
      localaod.tQb = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(13337752502272L, 99374);
      return 0;
    }
    GMTrace.o(13337752502272L, 99374);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */