package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class btv
  extends com.tencent.mm.bm.a
{
  public String tVH;
  public String ugy;
  public String vbh;
  public bto vcA;
  public btu vcB;
  public int vcu;
  public int vcv;
  public String vcz;
  
  public btv()
  {
    GMTrace.i(3767088971776L, 28067);
    GMTrace.o(3767088971776L, 28067);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3767223189504L, 28068);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vcz == null) {
        throw new b("Not all required fields were included: EntranceDomain");
      }
      if (this.vbh == null) {
        throw new b("Not all required fields were included: Charset");
      }
      if (this.vcz != null) {
        paramVarArgs.e(4, this.vcz);
      }
      if (this.vbh != null) {
        paramVarArgs.e(12, this.vbh);
      }
      if (this.vcA != null)
      {
        paramVarArgs.fm(9, this.vcA.aYq());
        this.vcA.a(paramVarArgs);
      }
      if (this.vcB != null)
      {
        paramVarArgs.fm(10, this.vcB.aYq());
        this.vcB.a(paramVarArgs);
      }
      if (this.ugy != null) {
        paramVarArgs.e(5, this.ugy);
      }
      if (this.tVH != null) {
        paramVarArgs.e(6, this.tVH);
      }
      paramVarArgs.fk(7, this.vcu);
      paramVarArgs.fk(8, this.vcv);
      GMTrace.o(3767223189504L, 28068);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.vcz != null) {
        i = b.a.a.b.b.a.f(4, this.vcz) + 0;
      }
      paramInt = i;
      if (this.vbh != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.vbh);
      }
      i = paramInt;
      if (this.vcA != null) {
        i = paramInt + b.a.a.a.fj(9, this.vcA.aYq());
      }
      paramInt = i;
      if (this.vcB != null) {
        paramInt = i + b.a.a.a.fj(10, this.vcB.aYq());
      }
      i = paramInt;
      if (this.ugy != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ugy);
      }
      paramInt = i;
      if (this.tVH != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tVH);
      }
      i = b.a.a.a.fh(7, this.vcu);
      int j = b.a.a.a.fh(8, this.vcv);
      GMTrace.o(3767223189504L, 28068);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.vcz == null) {
        throw new b("Not all required fields were included: EntranceDomain");
      }
      if (this.vbh == null) {
        throw new b("Not all required fields were included: Charset");
      }
      GMTrace.o(3767223189504L, 28068);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      btv localbtv = (btv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 11: 
      default: 
        GMTrace.o(3767223189504L, 28068);
        return -1;
      case 4: 
        localbtv.vcz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3767223189504L, 28068);
        return 0;
      case 12: 
        localbtv.vbh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3767223189504L, 28068);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bto();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bto)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbtv.vcA = ((bto)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3767223189504L, 28068);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new btu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((btu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbtv.vcB = ((btu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3767223189504L, 28068);
        return 0;
      case 5: 
        localbtv.ugy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3767223189504L, 28068);
        return 0;
      case 6: 
        localbtv.tVH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3767223189504L, 28068);
        return 0;
      case 7: 
        localbtv.vcu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3767223189504L, 28068);
        return 0;
      }
      localbtv.vcv = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3767223189504L, 28068);
      return 0;
    }
    GMTrace.o(3767223189504L, 28068);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\btv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */