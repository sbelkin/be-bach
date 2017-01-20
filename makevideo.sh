#!/usr/bin/env bash
mkdir /home/root/boot-backup
cp -rp /boot/* /home/root/boot-backup/
umount /boot
mkfs.vfat -v -nboot -F16 /dev/mmcblk0p7
mount /boot
cp -rp /home/root/boot-backup/* /boot
rm -r /home/root/boot-backup
