package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class att
  extends azh
{
  public String jio;
  public int lQc;
  public String uHz;
  public int uJj;
  public int uJk;
  public int uJl;
  public int upl;
  public int upm;
  public String urj;
  
  public att()
  {
    GMTrace.i(3959422976000L, 29500);
    GMTrace.o(3959422976000L, 29500);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3959557193728L, 29501);
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
      paramVarArgs.fk(2, this.uJj);
      paramVarArgs.fk(3, this.lQc);
      if (this.uHz != null) {
        paramVarArgs.e(4, this.uHz);
      }
      if (this.urj != null) {
        paramVarArgs.e(5, this.urj);
      }
      if (this.jio != null) {
        paramVarArgs.e(6, this.jio);
      }
      paramVarArgs.fk(7, this.uJk);
      paramVarArgs.fk(8, this.upl);
      paramVarArgs.fk(9, this.upm);
      paramVarArgs.fk(10, this.uJl);
      GMTrace.o(3959557193728L, 29501);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uJj) + b.a.a.a.fh(3, this.lQc);
      paramInt = i;
      if (this.uHz != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uHz);
      }
      i = paramInt;
      if (this.urj != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.urj);
      }
      paramInt = i;
      if (this.jio != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.jio);
      }
      i = b.a.a.a.fh(7, this.uJk);
      int j = b.a.a.a.fh(8, this.upl);
      int k = b.a.a.a.fh(9, this.upm);
      int m = b.a.a.a.fh(10, this.uJl);
      GMTrace.o(3959557193728L, 29501);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3959557193728L, 29501);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      att localatt = (att)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3959557193728L, 29501);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localatt.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 2: 
        localatt.uJj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 3: 
        localatt.lQc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 4: 
        localatt.uHz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 5: 
        localatt.urj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 6: 
        localatt.jio = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 7: 
        localatt.uJk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 8: 
        localatt.upl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      case 9: 
        localatt.upm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959557193728L, 29501);
        return 0;
      }
      localatt.uJl = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3959557193728L, 29501);
      return 0;
    }
    GMTrace.o(3959557193728L, 29501);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\att.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */