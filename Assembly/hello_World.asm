.section    __TEXT,__cstring,cstring_literals
msg:
    .asciz "Hello, ARM64 world!\n"

.section    __TEXT,__text,regular,pure_instructions
.globl  _main
.p2align    2
_main:
    // write(int fd, const void *buf, size_t count)
    mov x0, 1          // stdout
    ldr x1, =msg       // message address
    mov x2, 18         // message length
    mov x16, 4         // syscall number (write)
    svc 0              // syscall

    // exit(int status)
    mov x0, 0
    mov x16, 1         // syscall number (exit)
    svc 0