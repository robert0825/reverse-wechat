package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bgl
  extends azh
{
  public int jib;
  public String tPP;
  public int tRC;
  public int tRD;
  public long tXT;
  public int uDI;
  public LinkedList<bet> uDJ;
  public bet uSh;
  
  public bgl()
  {
    GMTrace.i(3764404617216L, 28047);
    this.uDJ = new LinkedList();
    GMTrace.o(3764404617216L, 28047);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3764538834944L, 28048);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uSh == null) {
        throw new b("Not all required fields were included: BufferUrl");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tRD);
      paramVarArgs.fk(3, this.tRC);
      if (this.tPP != null) {
        paramVarArgs.e(4, this.tPP);
      }
      if (this.uSh != null)
      {
        paramVarArgs.fm(5, this.uSh.aYq());
        this.uSh.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.uDI);
      paramVarArgs.d(7, 8, this.uDJ);
      paramVarArgs.T(8, this.tXT);
      paramVarArgs.fk(9, this.jib);
      GMTrace.o(3764538834944L, 28048);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tRD) + b.a.a.a.fh(3, this.tRC);
      paramInt = i;
      if (this.tPP != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tPP);
      }
      i = paramInt;
      if (this.uSh != null) {
        i = paramInt + b.a.a.a.fj(5, this.uSh.aYq());
      }
      paramInt = b.a.a.a.fh(6, this.uDI);
      int j = b.a.a.a.c(7, 8, this.uDJ);
      int k = b.a.a.a.S(8, this.tXT);
      int m = b.a.a.a.fh(9, this.jib);
      GMTrace.o(3764538834944L, 28048);
      return i + paramInt + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uDJ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uSh == null) {
        throw new b("Not all required fields were included: BufferUrl");
      }
      GMTrace.o(3764538834944L, 28048);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bgl localbgl = (bgl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3764538834944L, 28048);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbgl.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 2: 
        localbgl.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 3: 
        localbgl.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 4: 
        localbgl.tPP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bet();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bet)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbgl.uSh = ((bet)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 6: 
        localbgl.uDI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bet();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bet)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbgl.uDJ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3764538834944L, 28048);
        return 0;
      case 8: 
        localbgl.tXT = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3764538834944L, 28048);
        return 0;
      }
      localbgl.jib = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3764538834944L, 28048);
      return 0;
    }
    GMTrace.o(3764538834944L, 28048);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bgl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */