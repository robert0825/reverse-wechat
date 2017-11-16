package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class acb
  extends azh
{
  public int jhc;
  public LinkedList<asb> jhd;
  public int jib;
  public int tXv;
  public int usx;
  
  public acb()
  {
    GMTrace.i(3909493981184L, 29128);
    this.jhd = new LinkedList();
    GMTrace.o(3909493981184L, 29128);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3909628198912L, 29129);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jhc);
      paramVarArgs.d(3, 8, this.jhd);
      paramVarArgs.fk(4, this.tXv);
      paramVarArgs.fk(5, this.usx);
      paramVarArgs.fk(6, this.jib);
      GMTrace.o(3909628198912L, 29129);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.jhc);
      int j = b.a.a.a.c(3, 8, this.jhd);
      int k = b.a.a.a.fh(4, this.tXv);
      int m = b.a.a.a.fh(5, this.usx);
      int n = b.a.a.a.fh(6, this.jib);
      GMTrace.o(3909628198912L, 29129);
      return paramInt + i + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jhd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3909628198912L, 29129);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      acb localacb = (acb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3909628198912L, 29129);
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
          localacb.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3909628198912L, 29129);
        return 0;
      case 2: 
        localacb.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3909628198912L, 29129);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new asb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((asb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localacb.jhd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3909628198912L, 29129);
        return 0;
      case 4: 
        localacb.tXv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3909628198912L, 29129);
        return 0;
      case 5: 
        localacb.usx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3909628198912L, 29129);
        return 0;
      }
      localacb.jib = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3909628198912L, 29129);
      return 0;
    }
    GMTrace.o(3909628198912L, 29129);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\acb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */